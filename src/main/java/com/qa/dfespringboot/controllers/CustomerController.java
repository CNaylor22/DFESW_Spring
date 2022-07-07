package com.qa.dfespringboot.controllers;



import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfespringboot.entities.Customer;
import com.qa.dfespringboot.services.CustomerService;

@RestController

@RequestMapping("/customer") // adds a prefix to the request URL
public class CustomerController {


	private CustomerService service;
	
//	Dependency Injection
	public CustomerController(CustomerService service) {
		this.service = service;
	}


	
// POST - CREATE

	@PostMapping("/create") // localhost:8080/customer/create
	public Customer addCustomer( @RequestBody Customer customer) {
	
		return this.service.addCustomer(customer);
		
	}
		
//GET - READ
	@GetMapping("/readAll")
	public List<Customer> getAll() {
	
		return this.service.getAll();
	}

//Read by ID
	@GetMapping("/readById/{id}")
	public Customer readById(@PathVariable int id) {

		return this.service.get(id);
	}

//  PUT - Update
	@PutMapping("/update/{id}")
	public Customer update(@PathVariable int id, @RequestBody Customer customer) {
		
		return this.service.update(id,  customer);
	}

// return the updated customer

// DELETE   
	@DeleteMapping("/delete/{id}")
	public Customer delete(@PathVariable int id) {
		return this.delete(id);
	}

}
