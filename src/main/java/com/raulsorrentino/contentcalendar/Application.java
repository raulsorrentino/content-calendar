package com.raulsorrentino.contentcalendar;

import com.raulsorrentino.contentcalendar.model.Content;
import com.raulsorrentino.contentcalendar.model.Status;
import com.raulsorrentino.contentcalendar.model.Type;
import com.raulsorrentino.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content(
					null,
					"My first content with Spring Data",
					"Spring Data implemented",
					Status.IDEA,
					Type.COURSE,
					LocalDateTime.now(),
					null,
					""
			);
			repository.save(content);
		};
	}

}
