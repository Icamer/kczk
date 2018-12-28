package pl.kczk.przepisy.web.przepisycoresb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class PrzepisyCoresbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrzepisyCoresbApplication.class, args);
	}

}

