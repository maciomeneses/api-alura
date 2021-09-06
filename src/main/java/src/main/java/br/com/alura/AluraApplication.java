package src.main.java.br.com.alura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


@SpringBootApplication
@EnableSpringDataWebSupport
public class AluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraApplication.class, args);
	}

}
