package com.spring.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_roles")
public class CustomerRoles {
    @Id
    @Column(name = "customer_id")
    private int customerId;
    @Id
    @Column(name = "roles_role_id")
    private int rolesRoleId;
}
