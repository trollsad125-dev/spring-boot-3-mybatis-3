package com.spring.practice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCreationDTO {
    private String name;
    private String phoneNumber;
    private String email;
    private String role;
}
