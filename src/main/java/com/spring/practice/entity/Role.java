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
@NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id
    @SequenceGenerator(name="role_id_sequences", sequenceName="role_id_sequences")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_id_sequences"
    )
    private int id;
    private String roleName;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
