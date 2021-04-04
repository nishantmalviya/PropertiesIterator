package com.propertiesIterator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertiesIterator.config.PropertiesConfig;
import com.propertiesIterator.config.PropertiesConfig.CyberArkCredentials;


@Service
public class CyberArkService {
	@Autowired
	private PropertiesConfig propertiesConfig;
	
	public void print() {
		for(CyberArkCredentials cyberArkCredentials:propertiesConfig.getCyberArkCredentials()) 
		{
			System.out.println(cyberArkCredentials);
		}
	}
}
