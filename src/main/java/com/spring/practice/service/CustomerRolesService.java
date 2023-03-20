package com.spring.practice.service;


import java.util.List;

public interface CustomerRolesService {
    // Create Operation
    int createCustomerRoles(Integer customerId, List<Integer> roleId);

    //Delete Operation
    int deleteCustomerById(Integer id);
}
