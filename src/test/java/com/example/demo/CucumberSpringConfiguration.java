package com.example.demo;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@CucumberContextConfiguration
@SpringBootTest
public class CucumberSpringConfiguration {
}
