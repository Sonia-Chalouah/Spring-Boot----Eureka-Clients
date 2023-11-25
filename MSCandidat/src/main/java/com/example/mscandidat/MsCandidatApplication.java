package com.example.mscandidat;

import com.example.mscandidat.Entity.Candidat;
import com.example.mscandidat.Repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient
public class MsCandidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCandidatApplication.class, args);
    }

    @Autowired
    private CandidatRepository repository;
    @Bean
    ApplicationRunner init() {
        return (args) -> {
            //save
            repository.save(new Candidat("Mariem", "Ch", "na@esprit.tn"));
            repository.save(new Candidat("Sarra", "ab", "sa@esprit.tn"));
            repository.save(new Candidat("Mohamed", "ba", "no@esprit.tn"));
            //fetch
            repository.findAll().forEach(System.out::println);

        };
    }
}
