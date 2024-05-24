package com.openclassrooms.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.openclassrooms.helloworld.service.BusinessService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest //permet d'initialiser le contexte Spring
class HelloworldApplicationTests {

    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetHelloWorld() {
        String expected = "Salut World!";
        String result = bs.getHelloWorld().getValue();
        assertEquals(expected, result);
    }


}
