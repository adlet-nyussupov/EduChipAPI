package com.moniumverse.educhip.app.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.moniumverse.educhip.app.ws.security.AppProperties;


@SpringBootApplication
public class EduchipAppWsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EduchipAppWsApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder createSpringApplicationBuilder() {

		return super.createSpringApplicationBuilder();
	}

	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	
	@Bean 
	public SpringApplicationContext springApplicationContext() {
		
		return new SpringApplicationContext();
	}
	
	
	@Bean 
	public AppProperties getAppProperties() {
		
		return new AppProperties();
	}

}
