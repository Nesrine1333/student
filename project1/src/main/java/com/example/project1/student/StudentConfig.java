package com.example.project1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student daizy = new Student("Daizy","daizy@hotmail.com",LocalDate.of(2005, JANUARY,12));

            Student mariya = new Student("Mariya", "mariya@hotmail.com", LocalDate.of(2005, JANUARY,12));


            repository.saveAll(
                    List.of(mariya,daizy)
            );
        };

    }
}
