package com.vulnerableworkshop.idor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vulnerableworkshop.idor.service.IdorService;

@RestController
public class IdorController 
{
	
	@Autowired
	IdorService idorService;
	
	@GetMapping("/idor")
	public String idorVulnerability(@RequestParam String idpage)
	{
		return idorService.doIdor(idpage);
	}
	
	

}
