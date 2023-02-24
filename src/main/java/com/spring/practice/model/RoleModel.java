package com.spring.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class RoleModel {
    private int id;
    private String roleName;
    private LocalDateTime createAt;
}
