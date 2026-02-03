import java.util.Scanner;
public class Primenum {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("PRIME NUMBER COUNTER");
        System.out.println("--------------------");
        System.out.println("Enter The Starting Number: ");
        int stnum=scanner.nextInt();
        System.out.println("Enter The Ending Number");
        int ennum=scanner.nextInt();
        while(stnum<=0||ennum<0){
            System.out.println("INVALID INPUT");
            System.out.println("Enter The Starting Number Again: ");
            stnum=scanner.nextInt();
        }
        int a=2;
        while(stnum<=ennum){
             a=2;
             int IsPrime=1;
            while(a<stnum&& IsPrime==1){
               if(stnum%a==0){
                IsPrime=0;
               }
               a++;
            }
            if(IsPrime==1 && stnum>1){
                System.out.print(stnum+" ");
            }
            
           stnum++;
        }
        
    }
}    

