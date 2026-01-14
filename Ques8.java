import java.util.Scanner;
public class Ques8{
    public static void main(String[]args){
        //AREA OF TRIANGLE
        System.out.println("AREA OF TRIANGLE CALCULATOR");
        System.out.println("X-------------------------X");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the length of the first side of triangle(a): ");
        float a=scanner.nextFloat();
        System.out.print("Enter the length of the second side of triangle(b): ");
        float b=scanner.nextFloat();
        System.out.print("Enter the length of the third side of triangle(c): ");
        float c=scanner.nextFloat();
        while(a<=0||b<=0||c<=0){
            System.out.println("Invalid Input One Of Your Values Must Be Negative Or Zero.Try Again");
            System.out.print("Enter the length of the first side of triangle(a): ");
             a=scanner.nextFloat();
            System.out.print("Enter the length of the second side of triangle(b): ");
             b=scanner.nextFloat();
            System.out.print("Enter the length of the third side of triangle(c): ");
            c=scanner.nextFloat();    
        }
        float s= (a+b+c)/2;
        System.out.printf("s=%.2f%n",s);
        double area= Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.printf("The Area Of Your Triangle Is: %.2f", area);





    }
    
}
