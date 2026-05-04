public class Car {
    //These are all attributes of car
    String make="Ford";
    String model= "Mustang";
    int year=2025;
    double price= 500000.50;
    boolean isRunning= false;

    void start(){
        isRunning= true;
    System.out.println("Your car's engine has been started"); 
    }
    void stop(){
        isRunning= false;
        System.out.println("You turnoff the engine");
    }
    void drive(){
        System.out.println("You are driving the: "+model);
    }
    void brake(){
        System.out.println("You have applied the brakes");
    }
}
