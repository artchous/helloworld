package ch.abraxas.caritopics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ch.abraxas.caritopics.service.BusinessService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CariTopicsBackendTests {

    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetHelloWorld() {

        String expected = "Hello World!";

        String result = bs.getHelloWorld().getValue();

        assertEquals(expected, result);
    }


}
