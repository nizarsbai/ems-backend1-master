package net.javaguides.ems_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.javaguides.ems_backend") // ✅ Ensures Spring scans all packages
public class EmsBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmsBackendApplication.class, args);
	}
}
