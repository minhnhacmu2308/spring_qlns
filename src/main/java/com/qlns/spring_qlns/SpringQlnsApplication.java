package com.qlns.spring_qlns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringQlnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQlnsApplication.class, args);
    }

}
