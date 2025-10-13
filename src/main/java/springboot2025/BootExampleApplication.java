package springboot2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootExampleApplication.class, args);
    }
}
