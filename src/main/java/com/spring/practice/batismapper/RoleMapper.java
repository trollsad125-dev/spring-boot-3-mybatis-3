package com.spring.practice.batismapper;

import com.spring.practice.entity.Customer;
import com.spring.practice.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RoleMapper {
    Role findByRoleName(@Param("roleName") String roleName);

    int createNewRole(Role role);

    List<Role> getAllRoles();

    int updateRoles(Role role);

    int deleteRoleById(@Param("id") int id);
}
