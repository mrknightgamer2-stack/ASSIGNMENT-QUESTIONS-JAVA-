//import java.util.Random;
//import java.util.Scanner;
public class OOP_Class_Car {
    public static void main(String[] args) {
        //Scanner scanner= new Scanner(System.in);
        //Random random= new Random();
        Car car = new Car();
        //if we print car directly we will get a memory adress.
        System.out.println(car.make);
        System.out.println(car.price);
        System.out.println(car.model);
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();


    }
}
