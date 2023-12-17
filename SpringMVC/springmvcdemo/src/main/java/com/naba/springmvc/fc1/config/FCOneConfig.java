package com.naba.springmvc.fc1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.naba.springmvc.fc1.AddController;
import com.naba.springmvc.fc1.service.AddService;

@Configuration
@ComponentScan({ "com.naba.springmvc.fc1" })
@EnableWebMvc
public class FCOneConfig {

    @Bean
    public AddService addService() {
        return new AddService();
    }

    @Bean
    public AddController addController(AddService addService) {
        return new AddController(addService);
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
        return vr;
    }
}

// this file replaces frontController-servlet.xml