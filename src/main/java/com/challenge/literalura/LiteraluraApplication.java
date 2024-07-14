package com.challenge.literalura;

import com.challenge.literalura.controller.LiterAluraController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiteraluraApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LiterAluraController controller) {
        return args -> {
            controller.start();
        };
    }
}
