package com.example.company_yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class CompanyYuApplication  extends SpringBootServletInitializer {
  @Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(CompanyYuApplication.class);
}
	public static void main(String[] args) {
		SpringApplication.run(CompanyYuApplication.class, args);
	}
}
