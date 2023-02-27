package com.spring.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Table(name = "role")
public class Role {
    @Id
    @SequenceGenerator(name="role_id_sequences", sequenceName="role_id_sequences")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_id_sequences"
    )
    @Column(name = "role_id",nullable = false,unique = true)
    private int roleId;
    @Column(name = "role_name",nullable = false)
    private String roleName;
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<Customer> customer;
}
