package com.vega.springit;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmanApplication.class, args);
	}

	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}
}
