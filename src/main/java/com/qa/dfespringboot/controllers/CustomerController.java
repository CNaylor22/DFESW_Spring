package com.qa.dfespringboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfespringboot.entities.Customer;

//import com.qa.dfespringboot.entities.Customer;




@RestController
@RequestMapping("/customer") // adds a prefix  to the request URL
public class CustomerController {

	
private List<Customer> customers = new ArrayList<>();
	
@GetMapping("/test")
public String test() {
    return "Hello, World!";
}






//	GET - READ
@GetMapping("/hello") //localhost : 8080/customer/hello
public String hello() {
	return "Hello";
}

// POST - CREATE
@PostMapping("/create")
public Customer create(@RequestBody Customer customer) {
this.customers.add(customer);

return this.customers.get(this.customers.size()-1);
	}



}