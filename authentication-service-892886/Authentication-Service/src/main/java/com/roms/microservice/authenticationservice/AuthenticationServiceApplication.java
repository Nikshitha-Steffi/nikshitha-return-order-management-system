package com.roms.microservice.authenticationservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import com.roms.microservice.authenticationservice.entity.User;
import com.roms.microservice.authenticationservice.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class AuthenticationServiceApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Inserting User in DB");
		String roles = "ROLE_USER";
		userRepository.save(new User("Nikshitha","nikshitha@gmail.com", passwordEncoder.encode("nikshitha"),"1234567890123456", new BigDecimal(50000),roles));
		userRepository.save(new User("Steffi","steffi@gmail.com", passwordEncoder.encode("steffi123"),"1234567890123457", new BigDecimal(50000),roles));
		userRepository.save(new User("Priya","priya@gmail.com", passwordEncoder.encode("priya123"),"1234567890123496", new BigDecimal(50000),roles));
		userRepository.save(new User("Arun","arun@gmail.com", passwordEncoder.encode("arun123"),"1234567890123459", new BigDecimal(50000),roles));
		log.info("User are inserted into DB");
	}
	
	@Configuration
	public class WebConfiguration implements WebFluxConfigurer {

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**").allowedMethods("*").allowedHeaders("*")
			.allowedOriginPatterns("*");
	    }
	}

}
