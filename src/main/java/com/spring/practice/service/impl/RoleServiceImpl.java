package com.spring.practice.service.impl;

import com.spring.practice.entity.Role;
import com.spring.practice.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


import java.util.List;

@Slf4j
@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public Role createNewRole(Role role) {
        return null;
    }

    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public Role updateRole(Role role, Integer id) {
        return null;
    }

    @Override
    public void deleteRole(Integer id) {

    }

    @Override
    public Role getRoleByName(String name) {
        return null;
    }
}
