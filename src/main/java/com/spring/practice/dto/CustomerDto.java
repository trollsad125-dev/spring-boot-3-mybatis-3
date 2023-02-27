package com.spring.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter @AllArgsConstructor
public class CustomerDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String role;
}
