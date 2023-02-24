package com.spring.practice.service.impl;

import com.spring.practice.batismapper.CustomerMapper;
import com.spring.practice.dto.CustomerDto;
import com.spring.practice.entity.Customer;
import com.spring.practice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;

    private final ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerMapper customerMapper,ModelMapper modelMapper){
        this.customerMapper=customerMapper;
        this.modelMapper=modelMapper;
    }
    @Override
    public CustomerDto createNewCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customerList = customerMapper.getAllCustomer();
        List<CustomerDto> customerDtoList = modelMapper.map(customerList, customerList.getClass());
        return customerDtoList;
    }

    @Override
    public List<CustomerDto> getCustomerById(Integer id) {
        return null;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customer, Integer id) {
        return null;
    }

    @Override
    public void deleteCustomerById(Integer id) {
        log.info("Delete a customer by Id");
    }
}
