package com.vulnerableworkshop.HostHeaderInjection.service;

import org.springframework.stereotype.Service;

@Service
public class HostHeaderInjectionService 
{

	
	public String hostInjectionVuln(String header1,int hostInjection2)
	{
		
		if(hostInjection2==0)
		{
			return "admin credentials";
		}
		
		return "user credentials";
	}
}
