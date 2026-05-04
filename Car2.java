public class Car2 {
    String model;
    String colour;
    Car2(String model, String colour){
        this.model= model;
        this.colour= colour;
    }
    void drive(){
        System.out.println("You are driving "+ this.colour+" "+ this.model);
    }
    
}
