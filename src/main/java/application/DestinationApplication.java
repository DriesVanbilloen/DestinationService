package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.DestinationController;


@SpringBootApplication
@ComponentScan(basePackageClasses = DestinationController.class)
public class DestinationApplication {
	public static void main(String[] args) {
		SpringApplication.run(DestinationApplication.class, args);
	}
}
