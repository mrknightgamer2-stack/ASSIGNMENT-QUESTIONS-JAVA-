import java.util.Scanner;
public class ArrayMatrices {
    public static void main(String[]args){
        System.out.println("INPUTTED MATRIX MULTIPLICATION PROGRAM");
        Scanner inp=new Scanner(System.in);
        int[][]A=new int[3][3];
        int[][]B=new int[3][3];
        int[][]C=new int[3][3];
        System.out.println("ENTER NUMBERS FOR 3X3 MATRICE A: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j]=inp.nextInt();
                System.out.printf("YOUR CHOSEN NUMBER: %d AT ROW: %d AND COLUMN: %d %n",A[i][j],i,j);
            }
        }
        System.out.println("ENTER NUMBERS FOR 3X3 MATRICE B: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=inp.nextInt();
                System.out.printf("YOUR CHOSEN NUMBER: %d AT ROW: %d AND COLUMN: %d %n",B[i][j],i,j);
            }
        }
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                int x=0;
                for(int k=0;k<3;k++){
                    x+=(A[r][k]*B[k][c]); 
                }
                C[r][c]=x;
            }
        }
        System.out.println("YOUR RESULTANT MATRIX C: ");
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.print(C[r][c]+" ");
            }
            System.out.println();
        }
    }
    
    
}
