package com.example.atService;

import com.example.atService.craftsman.Craftsman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class AtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtServiceApplication.class, args);
	}

}
