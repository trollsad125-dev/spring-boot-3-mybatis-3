package com.spring.practice.controller.impl;

import com.spring.practice.controller.CustomerController;
import com.spring.practice.dto.CustomerDto;
import com.spring.practice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class CustomerControllerImpl implements CustomerController {

    private final CustomerService customerService;
    private final ModelMapper modelMapper;


    public CustomerControllerImpl(CustomerService customerService,ModelMapper modelMapper) {
        this.customerService = customerService;
        this.modelMapper=modelMapper;

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
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return null;
    }
}
