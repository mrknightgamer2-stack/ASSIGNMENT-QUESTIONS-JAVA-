import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
         //TO CREATE A PROGRAM THAT CALCULATES DISCOUNTED PRICE OF PRODUCTS
          System.out.println("DISCOUNT CALCULATOR");
        System.out.println("X---------------------X");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the orignal price of your selected item(Rs): ");
        int org_price1= scanner.nextInt();
// remove line 9 and  int dis=scanner.nextInt(); alternate methode
        while(org_price1<=0){
            System.out.println("Orignal price can't be less than or equal to zero");
            System.out.print("Enter the orignal price of your selected item again (Rs): ");
            org_price1= scanner.nextInt();
        }

        System.out.print("Enter the discount on your selected item(%):");
        int dis=scanner.nextInt(); 
        float disc= dis/100f;
        while(disc>=1 || disc<0){
            System.out.println("Discount cannot be greater than or equal to 100% OR less than 0%"); 
            System.out.print("Enter the discount on your selected item(%):"); 
            dis= scanner.nextInt();
            disc=dis/100f; }

            calc_discount(org_price1, disc);//Calling the method to calculate discounted price
            scanner.close();
            System.out.println("Thank you for using the discount calculator!");
        }
        
    
     public static void calc_discount(int org_price1,float disc){
           
        float discounted_price= org_price1-(org_price1*disc);
        int rounded=Math.round(discounted_price);
        System.out.println("The discounted price of your selected item is: Rs "+ rounded);
        System.out.println("You saved Rs: "+ Math.round(org_price1*disc));

    }
    }
    

