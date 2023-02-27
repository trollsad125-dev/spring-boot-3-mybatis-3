package com.spring.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @SequenceGenerator(name="customer_id_sequences", sequenceName="customer_id_sequences")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequences"
    )
    @Column(name = "id", nullable = false,unique = true)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "loyalty", nullable = false)
    private boolean loyalty;
    //TODO: Investigate why using CascadeType.MERGE || CascadeType.PERSIST
    //TODO: https://stackoverflow.com/questions/43846652/database-design-for-user-userrole-many-to-many-relationship
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Role> roles;
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
