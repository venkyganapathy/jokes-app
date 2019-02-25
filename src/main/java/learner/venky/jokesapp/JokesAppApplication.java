package learner.venky.jokesapp;

import learner.venky.jokesapp.infrastructure.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JokesAppApplication.class, args);

        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println("DB URL is "+dataSource.getDbUrl());
        System.out.println("DB Username is "+dataSource.getDbUserName());
        System.out.println("DB Password is "+dataSource.getDbPassword());
    }

}

