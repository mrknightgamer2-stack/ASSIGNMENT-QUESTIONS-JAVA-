import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        //CALCULATES ORGINAL PRICE IF DISCOUNTED PRICE AND DISCOUNT PERCENTAGE ARE GIVEN
         System.out.println("ORIGNAL PRICE CALCULATOR");
        System.out.println("X-----------------------X");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the discounted price of your selected item(Rs): ");
        int dis_price= scanner.nextInt();
// remove line 9 and  int dis=scanner.nextInt(); alternate methode
        while(dis_price<=0){
            System.out.println("Discounted price can't be less than or equal to zero");
            System.out.print("Enter the discounted price of your selected item again (Rs): ");
            dis_price= scanner.nextInt();
        }

        System.out.print("Enter the discount on your selected item(%):");
        int dis=scanner.nextInt(); 
        float disc= dis/100f;
        while(disc>=1 || disc<0){
            System.out.println("Discount cannot be greater than or equal to 100% OR less than 0%"); 
            System.out.print("Enter the discount on your selected item(%):"); 
            dis= scanner.nextInt();
            disc=dis/100f; }

            calc_orignal(dis_price, disc);//Calling the method to calculate orignal price
            scanner.close();
            System.out.println("Thank you for using the calculator!");
        }
        
    
     public static void calc_orignal(int dis_price,float disc){
           
        float org_price=dis_price/(1-disc);
        System.out.println("The orignal price of your selected item is: Rs "+org_price);
    }
    }
    

