import java.util.Scanner;
public class Ques5 {
    public static void main(String[]args){
        //WATT CALCULATOR
        System.out.println("WATT CALCULATOR");
        System.out.println("X---------------X");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the voltage(V): ");
        float voltage=scanner.nextFloat();
        System.out.print("Enter the current(A): ");
        float current=scanner.nextFloat();
        float watt=voltage*current;
        System.out.printf("The power consumed is: %.2f W",watt);

    }
    
}
