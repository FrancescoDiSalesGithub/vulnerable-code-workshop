package com.vulnerableworkshop.idor.service;

import org.springframework.stereotype.Service;

import com.vulnerableworkshop.idor.model.IdorDocumentModel;

@Service
public class IdorService 
{
		
	public String doIdor(String query)
	{
		if(query.equals("10"))
		{
			IdorDocumentModel modelSecret = new IdorDocumentModel();
			modelSecret.setMessage("{watch for index}");
			return "that's how idor works with this id there's my secret: "+modelSecret.getMessage();
		}
			
		
		return "document number: "+query;
	}

}
