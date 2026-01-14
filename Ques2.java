import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        //TAKES RADIUS OF CIRCLE AND CALCULATES AREA AND CIRCUMFERENCE
        System.out.println("Circle Area and Circumference Calculator");
        System.out.println("X---------------------------------------X");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius= scanner.nextFloat();
        while(radius<0){
            System.out.println("Invalid Input Try Again");
            System.out.print("Enter the radius of the circle: ");
            radius= scanner.nextFloat();
        }
        float pi=3.14159f;
        float area= pi*radius*radius;
        float circum= 2*pi*radius;
        System.out.printf("The area of the circle is: %.2f\n",area);
        System.out.printf("The circumference of the circle is: %.2f",circum);
        scanner.close();

    }
}
