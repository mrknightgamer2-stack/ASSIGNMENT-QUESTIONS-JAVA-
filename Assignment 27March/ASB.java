import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ASB {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter A Number To Be Converted: ");
        int x= scanner.nextInt();
        int Binum= BS10_2(x);
       System.out.printf("The binary number for %d is %d",x,Binum);
    }
    public static int BS10_2(int num10){
         if(num10==0)
            return 0;
        ArrayList<Integer>bin_num= new ArrayList<>();
        int temp=num10;
        while(temp>0){
            bin_num.add(temp%2);
            temp/=2;
        }
        
        Collections.reverse(bin_num);
        int result = 0;
        for (int bit : bin_num) {
            result = (result * 10) + bit; // Pushes digits to the left
        
        }
        return result;   
    }
}
