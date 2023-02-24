package com.spring.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(name="customer_id_sequences", sequenceName="customer_id_sequences")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequences"
    )
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean loyalty;
    @ManyToOne
    private Role role;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
