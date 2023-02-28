package com.spring.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@Table(name = "customer_roles")
public class CustomerRoles {
    @Id
    @Column(name = "customer_id")
    private int customerId;
    @Id
    @Column(name = "roles_role_id")
    private int rolesRoleId;
}
