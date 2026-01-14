import java.util.Scanner;
public class Ques7 {
    public static void main(String[]args){
        //EVEN ODD IDENTIDIER
        System.out.println("Even Odd Identifier");
        System.out.println("X-------------------X");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.printf("The number %d is Even.",num);
        } else if(num%2==1){
            System.out.printf("The number %d is Odd.",num);
        } else{
            System.out.printf("The number %d is neither Even nor Odd.",num);
        }
        }
        }
        

    
    

