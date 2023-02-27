package com.spring.practice.service.impl;

import com.spring.practice.repository.customer.CustomerMapper;
import com.spring.practice.dto.CustomerDto;
import com.spring.practice.entity.Customer;
import com.spring.practice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final ModelMapper mapper;

    public CustomerServiceImpl(CustomerMapper customerMapper, ModelMapper mapper){
        this.customerMapper=customerMapper;
        this.mapper=mapper;
    }
    @Override
    public CustomerDto createNewCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customerList = customerMapper.getAllCustomer();
        return customerList.stream().map(customer -> mapper.map(customer,CustomerDto.class)).collect(Collectors.toList());

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
