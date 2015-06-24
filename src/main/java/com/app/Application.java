package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Itai Peleg
 * @since 23/06/2015.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
