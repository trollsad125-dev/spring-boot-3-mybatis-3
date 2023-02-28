package com.spring.practice.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateUtils {
    public static LocalDateTime createNewDate(){
        return LocalDateTime.now();
    }
}
