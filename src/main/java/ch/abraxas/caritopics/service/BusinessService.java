package ch.abraxas.caritopics.service;

import ch.abraxas.caritopics.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    //retourne un objet de type HelloWorld
    public HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
