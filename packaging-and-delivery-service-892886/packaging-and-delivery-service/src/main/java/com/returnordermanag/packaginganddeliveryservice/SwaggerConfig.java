package com.returnordermanag.packaginganddeliveryservice;

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
			"Packaging and Delivery Microservice", 
			"The intent of this Microservice is to provide packaging and delivery charge for requested return. ComponentProcessing Microservice interacts with PackagingAndDelivery Microservice",
			"1.0",
			"ComponentProcessing Microservice interacts with PackagingAndDelivery Microservice", DEFAULT_CONTACT, 
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