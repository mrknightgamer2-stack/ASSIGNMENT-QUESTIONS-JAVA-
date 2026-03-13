import java.util.Scanner;
public class INMagicSQ {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int ar[][]= new int[3][3];
        System.out.println("ENTER THE NUMBER FOR MAGIC SQUARE: ");
        boolean IsMagic= false;
        int attempts= 0;
        while(!IsMagic){
            attempts++;
            for(int r=0; r<3; r++){
                for(int c=0; c<3; c++){
                ar[r][c]=0;
                }
            }
            for(int r=0; r<3; r++){
                for(int c=0; c<3; c ++){
                    int inp= scanner.nextInt();
                    while(inp>9|inp<=0){
                    System.out.println("Input Cannot Be Less Than Or Equal To Zero");
                    inp= scanner.nextInt();
                    }
                    if (IsPres(ar, inp)== false ){
                        ar[r][c]=inp;
                        System.out.println("Enter The Next Number: ");}
                    else{
                        System.out.println("Input Cannot Be A Repeating Number:");
                    }
                }}
                System.out.println();
            for(int r=0; r<3; r++){
                for(int c=0; c<3; c++){
                System.out.printf(" %d ",ar[r][c]);
                }
                System.out.println();
            }
            System.out.println("Now We Check Your Matrix To See If It Forms A Magic Square.");
            int r0= ar[0][0]+ar[0][1]+ar[0][2];
            int r1= ar[1][0]+ar[1][1]+ar[1][2];
            int r2= ar[2][0]+ar[2][1]+ar[2][2];

            int c0= ar[0][0]+ar[1][0]+ar[2][0];
            int c1= ar[0][1]+ar[1][1]+ar[2][1];
            int c2= ar[0][2]+ar[1][2]+ar[2][2];

            int d1= ar[0][0]+ar[1][1]+ar[2][2];
            int d2= ar[0][2]+ar[1][1]+ar[2][0];
            if (r0 == 15 && r1 == 15 && r2 == 15 && 
                        c0 == 15 && c1 == 15 && c2 == 15 && 
                        d1 == 15 && d2 == 15) {
                        IsMagic= true;
                    }else{
                        System.out.println("You Inputs Do Not Form A Magic Square Please Try Again");
                    }
   
        }
    
    System.out.println("Found after " + attempts + " attempts:");
    for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
            System.out.printf(" %d ",ar[r][c]);}

        System.out.println();
     }
        
    }
    public static boolean IsPres(int ar[][], int k){
        for(int[]row:ar)// Outer loop iterates through each row (1D array)
            for(int x: row){// Inner loop iterates through each element in the row
              if(x==k){
                return true;// returns true if value found
              }  
            }
        return false;// if the value is not found loop exits and returns false
    }
}
