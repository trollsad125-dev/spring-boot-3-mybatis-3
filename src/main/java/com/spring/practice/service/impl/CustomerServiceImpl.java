package com.spring.practice.service.impl;

import com.spring.practice.dto.CustomerCreationDTO;
import com.spring.practice.dto.CustomerDto;
import com.spring.practice.entity.Customer;
import com.spring.practice.entity.Role;
import com.spring.practice.repository.customer.CustomerMapper;
import com.spring.practice.service.CustomerRolesService;
import com.spring.practice.service.CustomerService;
import com.spring.practice.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final ModelMapper mapper;
    private final CustomerRolesService customerRolesService;
    private final RoleService roleService;

    public CustomerServiceImpl(CustomerMapper customerMapper, ModelMapper mapper, RoleService roleService, CustomerRolesService customerRolesService) {
        this.customerMapper = customerMapper;
        this.mapper = mapper;
        this.roleService = roleService;
        this.customerRolesService = customerRolesService;
    }

    @Override
    public int createNewCustomer(CustomerCreationDTO customerCreation) {
        Customer customer = mapper.map(customerCreation, Customer.class);
        customer.setLoyalty(false);
        List<Role> roleListFindByName = roleService.getRoleByName(customerCreation.getRoles());

        customer.setRoles(roleListFindByName);

        //TODO: Save in 2 table Customer and customer_roles(intermediate table of ManyToMany generated)
        customerRolesService.createCustomerRoles(customer.getId(), roleListFindByName.stream().map(Role::getRoleId).toList());
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
