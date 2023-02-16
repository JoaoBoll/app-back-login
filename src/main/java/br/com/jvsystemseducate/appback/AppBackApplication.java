package br.com.jvsystemseducate.appback;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class AppBackApplication {
	@Value("${spring.application.name}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(AppBackApplication.class, args);
	}
}
