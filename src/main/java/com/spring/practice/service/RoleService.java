package com.spring.practice.service;

import com.spring.practice.entity.Role;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface RoleService {
    // Create Operation
    Role createNewRole(Role role);

    // Read Operation
    List<Role> getAllRoles();

    //Update operation
    Role updateRole(Role role, Integer id);

    //Delete Operation
    void deleteRole(Integer id);

    //Get role by name
    Role getRoleByName(String name);

}
