package com.spring.practice.service.impl;

import com.spring.practice.entity.Role;
import com.spring.practice.repository.role.RoleMapper;
import com.spring.practice.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleMapper roleMapper){
        this.roleMapper=roleMapper;
    }

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
    public List<Role> getRoleByName(List<String> name) {
        return roleMapper.findByRoleName(name);
    }
}
