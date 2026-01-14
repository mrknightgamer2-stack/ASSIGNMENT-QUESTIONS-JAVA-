import java.util.Scanner;
public class Ques6 {
    public static void main(String[]args){
        //AREA OF TRAPEZOID
        System.out.println("AREA OF TRAPEZOID");
        System.out.println("X----------------X");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the length of the first parallel side (a):");
        float a=scanner.nextFloat();
        System.out.print("Enter the length of the second parallel side (b):");
        float b=scanner.nextFloat();
        System.out.print("Enter the height of trapezoid(h):");
        float h=scanner.nextFloat();
        while(a<=0||b<=0||h<=0){
            System.out.println("Invalid Input.One Of Your Values Must Have Been Negative.Try Again");
            System.out.print("Enter the length of the first parallel side (a):");
            a=scanner.nextFloat();
            System.out.print("Enter the length of the second parallel side (b):");
            b=scanner.nextFloat();
            System.out.print("Enter the height of trapezoid(h):");
            h=scanner.nextFloat();

        }
        float area=((a+b)/2)*h;
        System.out.printf("The area of the trapezoid is: %.2f",area);

    }
    
}
