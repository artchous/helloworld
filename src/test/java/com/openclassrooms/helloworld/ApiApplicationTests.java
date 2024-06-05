package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.service.CodeFragmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import com.openclassrooms.helloworld.service.BusinessService;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest //permet d'initialiser le contexte Spring
@AutoConfigureMockMvc
class ApiApplicationTests {

    @Autowired
    private BusinessService bs;
    private CodeFragmentService cs;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetHelloWorld() {
        String expected = "Salut World!";
        String result = bs.getHelloWorld().getValue();
        assertEquals(expected, result);
    }

    //Verifie la récupéération de la liste de tous les employés
    @Autowired
    public MockMvc mockMvc;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].firstName", is("Laurent")));
    }


//    @Test
//    public void testGetLanguageCode() throws Exception {
//
//        mockMvc.perform(get("/codefragment"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].language", is("java")));
//
//    }

}