package com.portfolio.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BlogDddApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogDddApplication.class, args);
    }

}
