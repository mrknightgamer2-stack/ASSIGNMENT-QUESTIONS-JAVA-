import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter input 1 for calculator(double): ");
        double num1= scanner.nextDouble();
        System.out.println("Enter input 2 for calculator(double): ");
        double num2= scanner.nextDouble();
        Calculator Casio1= new Calculator();
        Calculator Casio2= new Calculator(num1,num2);
        Calculator Casio3= new Calculator(Casio2);
        Casio3.SetNums(23.3, 59.4);

        double Add1= Casio1.add();
        double Subt1= Casio1.subtract();
        double Mult1= Casio1.multiply();
        double Div1= Casio1.divide();
        double C1V1= Casio1.getNum1();
        double C1V2= Casio1.getNum2();
        double Mod1= Casio1.modulus();
        double Avg1= Casio1.average();
        double Max1= Casio1.max();
        System.out.printf("Results of Casio1 Num1= %.2f and Num2= %.2f calculation:\n Addition=%.2f\nSubtraction=%.2f\nMultiplication=%.2f\nDivistion=%.2f\nModulus=%.2f\nAverage=%.2f\nMax=%.2f",C1V1,C1V2,Add1,Subt1,Mult1,Div1,Mod1,Avg1,Max1);
        System.out.println();

        double Add2= Casio2.add();
        double Subt2= Casio2.subtract();
        double Mult2= Casio2.multiply();
        double Div2= Casio2.divide();
        double Mod2= Casio2.modulus();
        double Avg2= Casio2.average();
        double Max2= Casio2.max();
        double C2V1= Casio2.getNum1();
        double C2V2= Casio2.getNum2();
        System.out.printf("Results of Casio2 Num1= %.2f and Num2= %.2f calculation:\n Addition=%.2f\nSubtraction=%.2f\nMultiplication=%.2f\nDivistion=%.2f\nModulus=%.2f\nAverage=%.2f\nMax=%.2f",C2V1,C2V2,Add2,Subt2,Mult2,Div2,Mod2,Avg2,Max2);
        System.out.println();

        double Add3= Casio3.add();
        double Subt3= Casio3.subtract();
        double Mult3= Casio3.multiply();
        double Div3= Casio3.divide();
        double C3V1= Casio3.getNum1();
        double C3V2= Casio3.getNum2();
        double Mod3= Casio3.modulus();
        double Avg3= Casio3.average();
        double Min3= Casio3.min();
        System.out.printf("Results of Casio3 Num1= %.2f and Num2= %.2f calculation:\n Addition=%.2f\nSubtraction=%.2f\nMultiplication=%.2f\nDivistion=%.2f\nModulus=%.2f\nAverage=%.2f\nMinimum=%.2f",C3V1,C3V2,Add3,Subt3,Mult3,Div3,Mod3,Avg3,Min3);
        System.out.println();
        int obj= Calculator.ObjectCounter();
        System.out.println("The number of objects of Calculator class made= "+obj);
        System.out.println(Casio1);
        System.out.println(Casio2);
        System.out.println(Casio3);
        Casio1.Display();
        Casio2.Display();
        Casio3.Display();
    }
}
