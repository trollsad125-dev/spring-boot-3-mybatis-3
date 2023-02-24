package com.spring.practice.service;

import com.spring.practice.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    // Create Operation
    CustomerDto createNewCustomer(CustomerDto customer);

    // Read Operation
    List<CustomerDto> getAllCustomer();

    //Get Customer by Id
    List<CustomerDto> getCustomerById(Integer id);

    //Update operation
    CustomerDto updateCustomer(CustomerDto customer, Integer id);

    //Delete Operation
    void deleteCustomerById(Integer id);

}
