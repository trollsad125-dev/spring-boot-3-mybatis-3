package com.spring.practice.service.impl;

import com.spring.practice.service.CustomerRolesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerRolesServiceImpl implements CustomerRolesService {
    @Override
    public int createCustomerRoles(Integer customerId, List<Integer> roleId) {
        return 0;
    }

    @Override
    public int deleteCustomerById(Integer id) {
        return 0;
    }
}
