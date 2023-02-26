package com.spring.practice.repository.customer;

import com.spring.practice.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper {
    Customer findByCustomerId(@Param("id") int id);

    int createNewCustomer(@Param("customer") Customer customer);

    List<Customer> getAllCustomer();

    int updateCustomer(@Param("customer") Customer customer);

    int deleteById(@Param("id") int id);
}
