package com.springdata.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springdata.main.repositories")
public class UserMain
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserMain.class, args);
    }
}