package com.cts;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories
public class BankCustomerRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCustomerRegistrationApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/*"))
			    .apis(RequestHandlerSelectors.basePackage("com.cts"))
			    .build()
			    .apiInfo(apiDetails());
	}
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Bank Services",
				"Sample API for providing Bank Services",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Prashantha R", "www.cognizant.com", "844198@cognizant.com"),
				"API License",
				"http://cognizant.com",
				Collections.emptyList());
		
	}

}
