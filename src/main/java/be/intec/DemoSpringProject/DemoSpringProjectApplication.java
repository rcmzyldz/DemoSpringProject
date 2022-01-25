package be.intec.DemoSpringProject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Student API", version = "1.0", description = "Student Api Information"))
public class DemoSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringProjectApplication.class, args);
	}

}
