package com.spring;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {
	
	@Bean(name = "ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}

}
