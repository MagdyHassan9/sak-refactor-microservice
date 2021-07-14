package com.info.sak.lookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"com.info.sak.lookup", "com.info.sak.lookup.service"})
@EntityScan("com.info.sak.lookup")
@ComponentScan("com.info.sak.lookup.support")
public class SakLookupRefactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakLookupRefactorApplication.class, args);
	}

}
