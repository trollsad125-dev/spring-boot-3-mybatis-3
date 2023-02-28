package com.spring.practice.dto;

import lombok.Getter;
import java.util.*;
@Getter
public class CustomerCreationDTO {
    private String name;
    private String phoneNumber;
    private String email;
    private List<String> roles;
}
