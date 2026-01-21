import java.util.Scanner;
public class Rev_Counter{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Starting Number: ");
        int i=scanner.nextInt();
        while(i<=0){
            System.out.println("Number cannot be less than or equal to zero!!! Try Again: ");
            i= scanner.nextInt();
        }
        System.out.println("OUTPUT: ");
        System.out.println("--------");
        for(int a=i;a>=0;a--){
            System.out.println(a);
        }
    }
    
}
                                       