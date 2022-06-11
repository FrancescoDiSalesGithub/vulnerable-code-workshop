package com.vulnerableworkshop.HostHeaderInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.vulnerableworkshop.HostHeaderInjection.service.HostHeaderInjectionService;

@RestController
public class HostHeaderInjectionController 
{
	@Autowired
	HostHeaderInjectionService hostHeaderInjectionService;
	
	@GetMapping("/hostheaderinjection")
	public String hostHeaderInjection(@RequestHeader String hostInjection1,@RequestHeader int hostInjection2)
	{
		return hostHeaderInjectionService.hostInjectionVuln(hostInjection1, hostInjection2);
	}

}
