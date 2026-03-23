import java.util.Scanner;
public class SLAE {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of rows of Matrix A: ");
        int row= scanner.nextInt();
        System.out.println("Enter the number of columns of Matrix A: ");
        int col= scanner.nextInt();
        System.out.println("Enter the number of rows of Matrix B: ");
        int row1= scanner.nextInt();
        System.out.println("Enter the number of columns of Matrix B: ");
        int col1= scanner.nextInt();
        float A[][]= new float[row][col];
        float B[][]= new float[row1][col1];
        System.out.println("Enter the Co-Efficients of each equation(LHS VALUES): ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col; c++){
                A[r][c]= scanner.nextFloat();
                System.out.printf("Your Input= %.3f at row %d and column %d of Matrix A",A[r][c],r,c);
                System.out.println();
            }
        }
        System.out.println("Enter the Right Hand Side(RHS) values: ");
        for(int r=0;r<row1;r++){
            for(int c=0;c<col1; c++){
                B[r][c]= scanner.nextFloat();
                System.out.printf("Your Input= %.3f at row %d and column %d of Matrix B",B[r][c],r,c);
                System.out.println();
            }
        }
        for(int c=0;c<col;c++){//  R1/2
            A[0][c]= A[0][c]/2;
        }
        B[0][0]/=2;
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        float pivot=A[1][0];
        for(int c=0;c<col;c++){//  R2-(R2(1,0))R1
            A[1][c]= A[1][c]-(pivot*A[0][c]);
        }
        B[1][0]= B[1][0]-(pivot*B[0][0]);
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        for(int c=0;c<col;c++){//R3-(-3R1)
            A[2][c]= A[2][c]-(-4*A[0][c]);
        }
        B[2][0]= B[2][0]-(-4*B[0][0]);
       for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        for(int c=0;c<col;c++){// R2/3
            A[1][c]/=3;
        }
        B[1][0]/=3;
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        float pivot2=A[0][1];
        for(int c=0;c<col;c++){// R1-2R2
            A[0][c]= A[0][c]-(pivot2*A[1][c]);
        }
        B[0][0]= B[0][0]-(pivot2*B[1][0]);
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        float pivot3= A[2][1];
        for(int c=0;c<col;c++){// R3-13R2
            A[2][c]= A[2][c]-(pivot3*A[1][c]);
        }
        B[2][0]= B[2][0]-(pivot3*B[1][0]);
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        float pivot4= A[2][2];
        for(int c=0;c<col;c++){// R3*-1/R3(2,2)
            A[2][c]*= (1/pivot4); 
        }
        B[2][0]*= (1/pivot4);
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        float pivot5= A[1][2];
        for(int c=0;c<col;c++){// R2-A(1,2)R3
            A[1][c]= A[1][c]-(pivot5*A[2][c]);
        }
        B[1][0]= B[1][0]-(pivot5*B[2][0]);
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        }
        System.out.println();
        float pivot6= A[0][2];
        for(int c=0;c<col;c++){// R1-(-A(0,2)R3)
            A[0][c]= A[0][c]-((pivot6*A[2][c]));
        }
        B[0][0]= B[0][0]-((pivot6*B[2][0]));
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.printf("%.3f ", A[r][c]);
             }
        System.out.printf("| %.3f\n", B[r][0]);
        } 
        System.out.println("-------------------------------------------------------------------");
        System.out.println("VERIFICATION OF ANSWER");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Enter Co-Efficients And RHS Values Of Any Equation For Verification:");
        System.out.println("Enter Co-Eff of x: ");
        float ax= scanner.nextFloat();
        System.out.println("Enter Co-Eff of y: ");
        float by= scanner.nextFloat();
        System.out.println("Enter Co-Eff of z: ");
        float cz= scanner.nextFloat();
        System.out.println("Enter RHS value: ");
        float c= scanner.nextFloat();
        float x= B[0][0];
        float y= B[1][0];
        float z= B[2][0];
        System.out.printf("%.2f(%.3f) + %.2f(%.3f) + %.2f(%.3f)",ax,x,by,y,cz,z);
        float res= Math.round((ax*x)+(by*y)+(cz*z));
        System.out.printf("%.3f = %.3f",res,c);
        System.out.println();
        if(res==c){
            System.out.println("YOUR RESULTS ARE VALID"+" "+res+" = "+c);
        }
        else{
            System.out.println("YOUR RESULTS ARE INVALID");
        }
    } 
}
