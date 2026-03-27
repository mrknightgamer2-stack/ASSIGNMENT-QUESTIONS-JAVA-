import java.util.Scanner;
public class ASC {
    public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter A Number To Be Converted: ");
    int x= scanner.nextInt();
    String Binum= BS10_2(x);
    System.out.printf("The binary number for %d is %s",x,Binum);
    }
    public static String BS10_2(int num10){
        if(num10==0)
         return "0";
        String bi_result= "";
        int temp=num10;
        while(temp>0){
            int rem= temp%2;
            bi_result=rem + bi_result;
            temp/=2;
        }
        return bi_result;   
        }
}   

