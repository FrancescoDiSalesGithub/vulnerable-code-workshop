package com.vulnerableworkshop.SensitiveDataExposure.service;

import org.springframework.stereotype.Service;

import com.vulnerableworkshop.SensitiveDataExposure.model.SensitiveDataExposureModel;

@Service
public class SensitiveDataExposureService 
{

	public String sensitiveDataExposureVuln(SensitiveDataExposureModel model)
	{
		return "Did you find the access token and secret token? ;)";
	}
	
}
