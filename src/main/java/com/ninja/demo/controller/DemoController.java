package com.ninja.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.demo.entity.DemoEntity;
import com.ninja.demo.jpa.DemoRepository;

@RestController
@RequestMapping("/")
public class DemoController {

	@Autowired
	 DemoRepository demoRepository;
	
	// Get All Customers
	 @GetMapping("/customers")
	 List<DemoEntity> all(){
	 return demoRepository.findAll(); 
	 }
	 
	// Get Single Customer
	 @GetMapping("/customers/{id}")
	 Optional <DemoEntity> findCustomer(@PathVariable Long id){
	 return demoRepository.findById(id);
	 }
	 
	// Create New Customer
	 @PostMapping("/customers")
	 DemoEntity createCustomer (@RequestBody DemoEntity newCustomer) {
	 return demoRepository.save(newCustomer);
	 }
	 
	// Update Customer Information
	 @PutMapping("/customers/{id}")
	 DemoEntity updateCustomer (@RequestBody DemoEntity updatedCustomer, @PathVariable Long id) {
	 return demoRepository.save(updatedCustomer);
	 }
	 
	// Delete Single Customer
	 @DeleteMapping ("/customers/{id}")
	 void deleteCustomer(@PathVariable Long id){
	 demoRepository.deleteById(id);
	 }
	 

	
}
