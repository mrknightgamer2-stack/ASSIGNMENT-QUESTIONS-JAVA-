//Exception Handling
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptions {
   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    try{
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();
    }
    catch(InputMismatchException w){
        System.out.print("THAT WAS NOT A NUMBER OPEN YOUR EYES!!!!!");
    }
    catch(ArithmeticException e){
        System.out.println("YOU CANNOT DIVIDE BY ZREO!!!!!");
    }
    catch(Exception a){
        System.out.println("UNEXPECTED ERROR");
    }
    finally{
        scanner.close();
        System.out.println("THE END :)");
    }
   } 
}
