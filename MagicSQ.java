import java.util.Random;
public class MagicSQ { 
    public static void main(String[]args){ 
    Random random= new  Random();
    boolean isMagic= false;
    int atempts=0;
    int[][]a= new int[3][3];
    while(!isMagic){
    atempts++;
    for(int r=0; r<3; r++) {
            for(int c=0; c<3; c++) {
                a[r][c] = 0; 
            }
        }
     a[0][1]=1;
     for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
        int ran;
        do { 
            ran= random.nextInt(1,10);
        } while (IsPres(a, ran));
         a[r][c]= ran; 
           
    }}
    int r0= a[0][0]+a[0][1]+a[0][2];
    int r1= a[1][0]+a[1][1]+a[1][2];
    int r2= a[2][0]+a[2][1]+a[2][2];

    int c0= a[0][0]+a[1][0]+a[2][0];
    int c1= a[0][1]+a[1][1]+a[2][1];
    int c2= a[0][2]+a[1][2]+a[2][2];

    int d1= a[0][0]+a[1][1]+a[2][2];
    int d2= a[0][2]+a[1][1]+a[2][0];
    if (r0 == 15 && r1 == 15 && r2 == 15 && 
                c0 == 15 && c1 == 15 && c2 == 15 && 
                d1 == 15 && d2 == 15) {
                isMagic = true;
            }
   
    }
    
    System.out.println("Found after " + atempts + " attempts:");
    for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
            System.out.printf(" %d ",a[r][c]);}

        System.out.println();
     }
    }

    public static boolean IsPres(int[][]a,int k){
        for(int[]row:a){
            for(int x: row){
                    if(x==k)
                    return true;
              
                }
            }
        return false;}
        
    }



