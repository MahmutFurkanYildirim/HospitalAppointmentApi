package com.furkanyildirim.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBeanClass {

    @Bean
    public ModelMapper modelMapperMethod(){
        return new ModelMapper();
    }
}
