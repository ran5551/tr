package cn.ran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("cn.ran")
@EntityScan("cn.ran")
@SpringBootApplication
public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
    }
}
