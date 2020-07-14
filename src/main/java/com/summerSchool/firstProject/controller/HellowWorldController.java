package com.summerSchool.firstProject.controller;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.summerSchool.firstProject.entities.ProductEntity;
import com.summerSchool.firstProject.repositories.ProductRepository;

@RestController
public class HellowWorldController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping(value="/createProduct")
	public String sayHelloToWorld() {
		ProductEntity product = getAProduct(1, "Acadele", 1.1d);
		productRepository.save(product);
		
		return "product : " + product.getProductName() + " was created succesfully";
	}
	
	@GetMapping(value="/getJson", produces=MediaType.APPLICATION_JSON_VALUE)
	public String sayHelloWorldJson(){
		return new JSONObject().put("message","hello world").toString();
	}
	
	private ProductEntity getAProduct(int id, String name, double price) {
		ProductEntity product = new ProductEntity();
		
		product.setId(id);
		product.setProductName(name);
		product.setPrice(price);
		
		return product;
	}
}