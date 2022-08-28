package com.vega.springit;

import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
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

//	@Bean
	CommandLineRunner commandLineRunner(LinkRepository linkRepository, CommentRepository commentRepository){
		return args -> {
			Link link = new Link("Spring boot course","https://www.udemy.com/course/spring-boot-2/learn/lecture/12571512#questions");
			linkRepository.save(link);

			Comment comment = new Comment("This course is good",link);
			commentRepository.save(comment);

			link.addComment(comment);
		};
	}
}
