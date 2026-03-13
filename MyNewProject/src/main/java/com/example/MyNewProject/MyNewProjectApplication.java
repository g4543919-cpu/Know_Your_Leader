package com.example.MyNewProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MyNewProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyNewProjectApplication.class, args);
	}

}
