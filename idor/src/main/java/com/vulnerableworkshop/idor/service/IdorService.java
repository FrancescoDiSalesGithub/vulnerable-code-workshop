package com.vulnerableworkshop.idor.service;

import org.springframework.stereotype.Service;

@Service
public class IdorService 
{
		
	public String doIdor(String query)
	{
		if(query.equals("10"))
			return "that's how idor works with this id there's my secret: document secret";
		
		return "document number: "+query;
	}

}
