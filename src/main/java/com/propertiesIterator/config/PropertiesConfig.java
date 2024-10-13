package com.propertiesIterator.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Configuration
@EnableConfigurationProperties
@Getter
@Setter
@ConfigurationProperties(prefix="astute")
public class PropertiesConfig {
	private final List<CyberArkCredentials> cyberArkCredentials =new ArrayList<>();
	@Data
	public static class CyberArkCredentials {
		private String safename;
		private String object;
		@Override
		public String toString() {
			return "CyberArkCredentials [safename=" + safename + ", object=" + object + "]";
		}
	}
}
