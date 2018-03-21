package com.liumapp.archetype.service.backend.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by liumapp on 10/9/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication(scanBasePackages = {"com.liumapp.archetype.service"})
@Import(com.liumapp.archetype.service.common.model.Main.class)
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}
