package com.patrones.comportamiento.chainOfResponsability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.patrones.disenno.comportamiento.chainOfResponsability.model")
public class ChainOfResponsabilityApiWsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ChainOfResponsabilityApiWsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		//return super.configure(builder);
		return builder.sources(ChainOfResponsabilityApiWsApplication.class);
	}
	

}
