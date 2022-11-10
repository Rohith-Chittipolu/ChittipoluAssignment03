package q11;
public class Car {
    //final will make sure engine is initialized
    private final Engine engine;  
       
    public Car(){
       engine  = new Engine();
    }
}

class Engine {
    private String type;
}
