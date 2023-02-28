package com.spring.practice.service;

import com.spring.practice.dto.CustomerCreationDTO;
import com.spring.practice.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    // Create Operation
    int createNewCustomer(CustomerCreationDTO customer);

    // Read Operation
    List<CustomerDto> getAllCustomer();

    //Get Customer by Id
    List<CustomerDto> getCustomerById(Integer id);

    //Update operation
    int updateCustomer(CustomerDto customer, Integer id);

    //Delete Operation
    int deleteCustomerById(Integer id);

}
