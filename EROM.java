public class EROM {
    public static void main(String[]args){
        System.out.println("ELEMENTARY ROW OPERATIONS ON MATRIX: ");
        System.out.println();
        double[][]A={{1,0,5},{9,6,4},{2,8,2}};
        double[][]I={{1,0,0},{0,1,0},{0,0,1}};
        for(int c=0;c<3;c++){//R2-9R1
            A[1][c]=A[1][c]-(9.0*A[0][c]);
            I[1][c]=I[1][c]-(9.0*I[0][c]);
        }
        for(int c=0;c<3;c++){//R3-2R1
            A[2][c]=A[2][c]-(2.0*A[0][c]);
            I[2][c]=I[2][c]-(2.0*I[0][c]);
        }
        for(int c=0;c<3;c++){//R2*1/6
            A[1][c]=(A[1][c])*(1.0/6.0);
            I[1][c]=(I[1][c])*(1.0/6.0);
        }
        for(int c=0;c<3;c++){//R3-8R2
            A[2][c]=A[2][c]-(8.0*A[1][c]);
            I[2][c]=I[2][c]-(8.0*I[1][c]);
        }
        for(int c=0;c<3;c++){//R3*3/140
            A[2][c]=(A[2][c])*(3.0/140.0);
            I[2][c]=I[2][c]*(3.0/140.0);
        }
        for(int c=0;c<3;c++){//R1-5R3
            A[0][c]=A[0][c]-(5.0*A[2][c]);
            I[0][c]=I[0][c]-(5.0*I[2][c]);
        }
        for(int c=0;c<3;c++){//R2+41/6R1
            A[1][c]=A[1][c]+((41.0/6.0)*A[2][c]);
            I[1][c]=I[1][c]+((41.0/6.0)*I[2][c]);
        }
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.print(A[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("INVERSE MATRIX: ");
        System.out.println();
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.printf("%.3f ",I[r][c]);
            }
            System.out.println();
        }
    }
}
