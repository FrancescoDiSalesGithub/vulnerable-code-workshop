package com.vulnerableworkshop.SensitiveDataExposure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vulnerableworkshop.SensitiveDataExposure.model.SensitiveDataExposureModel;
import com.vulnerableworkshop.SensitiveDataExposure.service.SensitiveDataExposureService;

@RestController
public class SensitiveDataExposureController 
{
	
	@Autowired
	SensitiveDataExposureService sensitiveDataExposureService;
	
	@Value("${app.accesstoken}")
	private String accessToken;
	@Value("${app.secret}")
	private String secretToken;
	
	@GetMapping("/sensitivedataexposure")
	public String sensitiveDataExposureVulnerability(@RequestBody SensitiveDataExposureModel model)
	{
		
		model.setAccessToken(accessToken);
		model.setSecret(secretToken);
		
		return sensitiveDataExposureService.sensitiveDataExposureVuln(model);
		
	}
	

}
