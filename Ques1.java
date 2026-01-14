import java.util.Scanner;
public class Ques1 {
    public static void main(String[]args){
//CALCULATES THE PERCENTAGE OF A STUDENT BY TAKING OBTAINED MARKS AND TOTAL MARKS AS INPUT.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Percentage Calculator");
        System.out.println("X--------------------X");
        System.out.print("Enter your obtained marks: ");
        int marks=scanner.nextInt();
        System.out.print("Enter your total marks: ");
        int total= scanner.nextInt();
        while(marks<0||total<=0||marks>total){
            System.out.println("Invalid Input Try Again");
            System.out.print("Enter your obtained marks: ");
            marks=scanner.nextInt();
            System.out.print("Enter your total marks: ");
            total= scanner.nextInt();
        }
        float per= (float)marks/total;
        float percentage=per*100;
        System.out.printf("Your percentage is: %.2f%%",percentage);
        scanner.close();


    }
    
}
