package com.qa.dfespringboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfespringboot.entities.Customer;
import com.qa.dfespringboot.repos.CustomerRepo;


@Service
public class CustomerService {

	private CustomerRepo repo;
	public CustomerService(CustomerRepo repo) {
		this.repo = repo;
	}
//ReadAll

 public List<Customer> readAll() {
	 return this.repo.findAll();
 }

//ReadByID

public Customer readByID(int id) {
return this.repo.findById(id).get();

}
// Create

public Customer create(Customer customer) {
	return this.repo.saveAndFlush(customer);

	}

//PUT - Update
public Customer update(int id, Customer customer ) {
//Get the existing entry
	Customer existing = this.repo.findById(id).get();
	
	existing.setFirstName(customer.getFirstName());
	existing.setLastName(customer.getLastName());
	existing.setEmail(customer.getEmail());
}


}	
