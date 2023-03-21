package com.spring.practice.repository.customer_roles;

import com.spring.practice.entity.CustomerRoles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerRolesMapper {
    int insertCustomerRoles(@Param("list") List<CustomerRoles> rolesList);
}
