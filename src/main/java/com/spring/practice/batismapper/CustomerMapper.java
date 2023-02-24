package com.spring.practice.batismapper;


import com.spring.practice.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import java.util.*;

@Mapper
@Component
public interface CustomerMapper {
    Customer findByCustomerId(@Param("id") int id);

    int createNewCustomer(@Param("customer") Customer customer);

    List<Customer> getAllCustomer();

    int updateCustomer(@Param("customer") Customer customer);

    int deleteById(@Param("id") int id);
}
