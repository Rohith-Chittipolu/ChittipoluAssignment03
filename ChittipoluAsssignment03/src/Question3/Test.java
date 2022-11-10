package Question3;


public class Test {
    
    public static void main(String args[]) {
        Vehicle vehicle = new Car();
        vehicle.getObject();
    }
}

class Vehicle {
   
    public Vehicle getObject(){
        System.out.println("returning vehicle object");
        return new Vehicle();
    }
}

    
class Car extends Vehicle {
         
    public Car getObject(){
        System.out.println("returning car object");
        return new Car();
    }        
}