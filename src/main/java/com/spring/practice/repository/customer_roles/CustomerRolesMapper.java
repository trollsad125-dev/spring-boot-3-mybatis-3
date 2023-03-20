package com.spring.practice.repository.customer_roles;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerRolesMapper {
    int insertCustomerRoles(Integer customerId, List<Integer> rolesList);
}
