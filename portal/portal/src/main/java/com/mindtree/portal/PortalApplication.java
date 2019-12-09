package com.mindtree.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class PortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder springapplicationbuilder) {
		return springapplicationbuilder.sources(PortalApplication.class);
		
	}
}
