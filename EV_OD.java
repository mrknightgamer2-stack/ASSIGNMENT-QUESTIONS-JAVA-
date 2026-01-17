import java.util.Scanner;
public class EV_OD {
    public static void main(String[]args){
        //EVEN NUMBER COUNTER BETWEEN TWO INPUTS
        System.out.println("EVEN NUMBER COUNTER BETWEEN TWO INPUT NUMBERS");
        System.out.println("-------------------------------------------");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your starting number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter your end point number: ");
        int num2=scanner.nextInt();
        System.out.println("RESULT");
        System.out.println("-------");
        while(num1<num2){
            if(num1%2==0){
                System.out.println(num1);
                num1+=2;

            }
            else{
                num1++;
                System.out.println(num1);
                num1+=2;
            }
        }



    }
    
}
