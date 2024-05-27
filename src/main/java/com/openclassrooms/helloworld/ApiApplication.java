package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.openclassrooms.helloworld.service.BusinessService;


@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    @Autowired
    private BusinessService bs;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }


    public void run(String... args) throws Exception {
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
        System.out.println("Hello World!");
    }

}
