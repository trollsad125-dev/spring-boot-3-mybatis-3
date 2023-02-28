package com.spring.practice.service.impl;

import com.spring.practice.dto.CustomerCreationDTO;
import com.spring.practice.entity.Role;
import com.spring.practice.repository.customer.CustomerMapper;
import com.spring.practice.dto.CustomerDto;
import com.spring.practice.entity.Customer;
import com.spring.practice.service.CustomerService;
import com.spring.practice.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final ModelMapper mapper;
    private final RoleService roleService;

    public CustomerServiceImpl(CustomerMapper customerMapper, ModelMapper mapper,RoleService roleService){
        this.customerMapper=customerMapper;
        this.mapper=mapper;
        this.roleService=roleService;
    }
    @Override
    public int createNewCustomer(CustomerCreationDTO customerCreation) {
        Customer customer = mapper.map(customerCreation,Customer.class);
        customer.setLoyalty(false);
        List<Role> roleListFindByName = roleService.getRoleByName(customerCreation.getRoles());
        customer.setRoles(roleListFindByName);
        return  customerMapper.createNewCustomer(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customerList = customerMapper.getAllCustomer();
        return customerList.stream().map(customer -> mapper.map(customer,CustomerDto.class)).toList();
    }

    @Override
    public List<CustomerDto> getCustomerById(Integer id) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDto customer, Integer id) {
        return 0;
    }

    @Override
    public int deleteCustomerById(Integer id) {
        log.info("Delete a customer by Id");
        return 0;
    }
}
