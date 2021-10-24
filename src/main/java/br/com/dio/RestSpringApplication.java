package br.com.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class RestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringApplication.class, args);
	}

}
