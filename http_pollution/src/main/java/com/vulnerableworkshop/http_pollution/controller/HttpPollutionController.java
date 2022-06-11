package com.vulnerableworkshop.http_pollution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vulnerableworkshop.http_pollution.service.HttpPollutionService;

@RestController
public class HttpPollutionController 
{
	
	@Autowired
	HttpPollutionService httpPollutionService;
	
	@GetMapping("/httppollution")
	public String httpPollutionVulnerability(@RequestParam String name,@RequestParam String surname,@RequestParam int isAdmin)
	{
		return httpPollutionService.httpPollutionVulnerability(name,surname,isAdmin);
	}
	

}
