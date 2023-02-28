package com.spring.practice.repository.role;

import com.spring.practice.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<Role> findByRoleName(@Param("listRole") List<String> roleName);

    int createNewRole(Role role);

    List<Role> getAllRoles();

    int updateRoles(Role role);

    int deleteRoleById(@Param("id") int id);
}
