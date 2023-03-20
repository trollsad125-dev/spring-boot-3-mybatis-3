package com.spring.practice.controller.impl;

import com.spring.practice.controller.CustomerController;
import com.spring.practice.dto.CustomerCreationDTO;
import com.spring.practice.dto.CustomerDto;
import com.spring.practice.service.CustomerService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@Slf4j
public class CustomerControllerImpl implements CustomerController {

    private final CustomerService customerService;


    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public List<CustomerDto> customerList() {
        return customerService.getAllCustomer();
    }

    @Override
    public CustomerDto getCustomerById(int id) {
        return null;
    }

    @Override
    public void deleteCustomerById(int id) {

    }

    @Override
    public CustomerDto updateCustomerById(CustomerDto customer, int id) {
        return null;
    }

    @Override
    public int createNewCustomer(@Valid @RequestBody CustomerCreationDTO customerDto) {
        return customerService.createNewCustomer(customerDto);
    }
}
