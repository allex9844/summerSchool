package com.summerSchool.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.summerSchool.firstProject.entities.ProductEntity;

@SpringBootApplication(scanBasePackages= {"com.summerSchool"})
@EnableAutoConfiguration
public class MyFirstProjectApplication {
	

	

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
		
		
		
		
	}

}
