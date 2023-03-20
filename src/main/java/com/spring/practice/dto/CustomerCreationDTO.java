package com.spring.practice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class CustomerCreationDTO {

    private @NotNull(message = "Please assign a name") String name;
    private String phoneNumber;

    private @NotNull(message = "Please assign a email") String email;

    private @NotNull(message = "Please assign a role or multi roles") List<String> roles;
}
