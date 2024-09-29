package com.example.cepscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CepSchedulerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CepSchedulerApplication.class, args);
  }

}
