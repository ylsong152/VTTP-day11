package sg.edu.nus.iss.ssfday11;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ssfday11Application {

	public static void main(String[] args) {
		SpringApplication.run(Ssfday11Application.class, args);

		// mvnw spring-boot:run -Dserver.port=3000
		// mvnw spring-boot:run -Dspringboot.run.arguments"--port 4000"

		// String port = "8080";
		// ApplicationArguments argsOptions = new DefaultApplicationArguments(port);

		// if (argsOptions.containsOption("port")) {
		// 	port = argsOptions.getOptionValues("port").get(0);
		// }

		// SpringApplication app = new SpringApplication(Ssfday11Application.class);
		// app.run(args);

		System.out.println("My first springboot app started...");
	}

}
