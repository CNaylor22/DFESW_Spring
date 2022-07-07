package com.qa.dfespringboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfespringboot.entities.Customer;


//JpaRepo requires both Entity and Data Type for the id column. Object version (int=Integer)
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
