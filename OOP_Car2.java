public class OOP_Car2 {
    public static void main(String[] args) {
    Car2 car1= new Car2("Ford","Black");
    Car2 car2= new Car2("Toyota","Blue");
    Car2 car3= new Car2("Honda","Red");

    Car2[]cars={car1,car2,car3};
    for(int i=0;i<cars.length;i++){
        cars[i].drive();
    }
    System.out.println();
     System.out.println();
    for(Car2 car: cars){
        car.colour="Black";
    }
    
    for(Car2 car: cars){
        car.drive();
    }
    }

}
