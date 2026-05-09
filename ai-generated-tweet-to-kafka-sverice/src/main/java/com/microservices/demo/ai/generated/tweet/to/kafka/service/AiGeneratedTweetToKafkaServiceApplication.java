package com.microservices.demo.ai.generated.tweet.to.kafka.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiGeneratedTweetToKafkaServiceApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AiGeneratedTweetToKafkaServiceApplication.class,args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Started");
    }
}
