package com.propertiesIterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;

import com.propertiesIterator.config.PropertiesConfig.CyberArkCredentials;
import com.propertiesIterator.service.CyberArkService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ConfigurationPropertiesScan("com.propertiesIterator")
public class Example {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Example.class, args);
		CyberArkService cyberArkService = appContext.getBean(CyberArkService.class);
		cyberArkService.print();
	}
}
