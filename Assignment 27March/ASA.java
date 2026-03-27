import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ASA{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("--------------BASE 10 TO BASE 2 NUMBER CONVERTER----------------");
        System.out.println("Enter A Base 10 Integer: ");
        int num10= scanner.nextInt();
        while(num10<0){
            System.out.println("Number can't be less than 0!");
            num10=scanner.nextInt();
        }
        if(num10==0)
            System.out.println(" "+0);
        ArrayList<Integer>bi_num= new ArrayList<>();
        int numL=num10;
        while(numL>0){
            int b_res= numL%2;
            bi_num.add(b_res);
            numL/=2;
        }
        Collections.reverse(bi_num);
        System.out.printf("Binary number for %d is: %s %n",num10,bi_num); 
    }
    
}
