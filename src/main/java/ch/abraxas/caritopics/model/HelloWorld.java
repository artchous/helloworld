package ch.abraxas.caritopics.model;

public class HelloWorld {
    private String value = "Hello World!";

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
