package com.openclassrooms.helloworld.service;

import com.openclassrooms.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    //retourne un objet de type HelloWorld
    public HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
