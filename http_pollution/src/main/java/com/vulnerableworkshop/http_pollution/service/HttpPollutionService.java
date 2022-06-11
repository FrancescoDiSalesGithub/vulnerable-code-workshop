package com.vulnerableworkshop.http_pollution.service;

import org.springframework.stereotype.Service;

@Service
public class HttpPollutionService 
{
	
	public String httpPollutionVulnerability(String name, String surname, int isAdmin)
	{
		
		if(isAdmin == 1)
			return "Welcome admin! name:"+name+" surname:"+surname;
		
		
		return "Welcome name:"+name+" surname:"+surname;
	}

}
