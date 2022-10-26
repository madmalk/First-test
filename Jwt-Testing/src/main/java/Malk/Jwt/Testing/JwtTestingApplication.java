package Malk.Jwt.Testing;

import Malk.Jwt.Testing.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtTestingApplication.class, args);
	}

}
