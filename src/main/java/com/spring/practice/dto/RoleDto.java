package com.spring.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class RoleDto {
    private String roleName;
    private LocalDateTime createAt;
}
