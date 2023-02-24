package com.spring.practice.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

//@Component
public class ConvertEntityToDTO<T> {
    final Class<T> typeParameterClass;
    public ConvertEntityToDTO(Class<T> typeParameterClass){
        this.typeParameterClass=typeParameterClass;
    }
/*
    public <T> convertToDto(Class<T> element, ModelMapper modelMapper){
        Class<T> entityElement = modelMapper.map(element,getClass().getGenericSuperclass());
        return entityElement;
    }*/
}
