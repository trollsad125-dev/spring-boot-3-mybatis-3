package com.spring.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@Builder
public class CustomerModel {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isNew;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
