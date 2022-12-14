package com.roms.microservice.componentprocessing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact(
			"Nikshitha",null ,"nikshitha.steffi@cognizant.com");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			"Component processing Microservice", 
			"The intent of this Microservice is to determine the Component processing detail. It interacts with\r\n"
			+ "packaging and delivery microservice to get the consolidated cost for the processing.\r\n",
			"1.0",
			"can be accessed only from an registered Client aplpication", DEFAULT_CONTACT, 
			"Return order Management System", "http://localhost/returnordermanagement", Arrays.asList());
	

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
			new HashSet<>(Arrays.asList("application/json"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
}