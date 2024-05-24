package com.openclassrooms.helloworld.model;

public class HelloWorld {
    private String value = "Salut World!";

    public String getValue(){
        return value;
    }

    public void setValue() {
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}
