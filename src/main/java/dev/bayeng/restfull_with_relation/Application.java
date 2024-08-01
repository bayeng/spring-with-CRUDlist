package dev.bayeng.restfull_with_relation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	CommandLineRunner runner(RunRepository runRepository) {
//		return args -> {
//			Run run = new Run(
//					3,
//					"Run 1",
//					LocalDateTime.now(),
//					LocalDateTime.now().plus(1, ChronoUnit.HOURS),
//					10,
//					"INDOOR"
//			);
//			log.info("Run: "+run);
//			runRepository.create(run);
//		};
//	}

}
