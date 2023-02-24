package com.spring.practice.controller;

import com.spring.practice.dto.CustomerDto;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/customer")
@SecurityRequirement(name = "javainuseapi")
public interface CustomerController {

    @GetMapping(value = {"/allCustomers"})
    List<CustomerDto> customerList();

    @GetMapping(value = {"/getCustomer/{id}"})
    CustomerDto getCustomerById(@PathVariable("id") int id);

    @DeleteMapping(value = {"/deleteCustomer/{id}"})
    void deleteCustomerById(@PathVariable("id") int id);

    @PutMapping(value = {"/updateCustomer/{id}"})
    CustomerDto updateCustomerById(@RequestBody CustomerDto customer, @PathVariable("id") int id);

    @PostMapping(value = {"/create"})
    CustomerDto createNewCustomer(@RequestBody CustomerDto customerDto);
}
