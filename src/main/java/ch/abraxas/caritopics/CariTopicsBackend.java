package ch.abraxas.caritopics;

import ch.abraxas.caritopics.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import ch.abraxas.caritopics.service.BusinessService;


@SpringBootApplication
public class CariTopicsBackend implements CommandLineRunner {

    @Autowired
    private BusinessService bs;

    public static void main(String[] args) {
        SpringApplication.run(CariTopicsBackend.class, args);
    }


    public void run(String... args) throws Exception {
        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
        System.out.println("Hello World!");
    }

}
