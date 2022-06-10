package com.vulnerableworkshop.sqlinjection.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vulnerableworkshop.sqlinjection.model.VulnUser;
import com.vulnerableworkshop.sqlinjection.service.SQLInjectionService;

@RestController
public class SqlInjectionController 
{
	@Autowired
	private SQLInjectionService sqlInjectionService;
	
    @GetMapping("/sqli")
    public String simpleQuery(@RequestParam String query)
    {
    	return sqlInjectionService.injection(query);
    	
    }
    
    @PostMapping("/sqli")
    public String simpleQueryPost(@RequestBody VulnUser vulnUser)
    {
    	if(vulnUser.getUsername() == null)
    		return "KO - insert a valid username";
    	
    		String injectionOutput = sqlInjectionService.injection(vulnUser.getUsername());
    		
    	if(injectionOutput == null)
    		return "KO - Something bad happened check the logs";
    	
    	return injectionOutput;
    }
    
}
