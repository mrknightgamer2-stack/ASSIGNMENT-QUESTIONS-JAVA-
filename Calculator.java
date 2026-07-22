public class Calculator {
    private double num1;
    private double num2;
    private static int obj_num=0;
    Calculator(){//null constructor
        this.num1=1.0;
        this.num2=2.0;
        obj_num++;
    } 
    Calculator(double num1,double num2){// parameterized constructor
        this.num1=num1;
        this.num2=num2;
        obj_num++;
    }
    Calculator(Calculator clone){// copy constructor
        this.num1= clone.num1;
        this.num2=clone.num2;
        obj_num++;
    }
    public static int ObjectCounter(){
        return obj_num;
    } 
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    public void SetNums(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double add(){
        return this.num1+this.num2;
    }
    public double subtract(){
        if(this.num1>this.num2){
            return this.num1-this.num2;
        }
        else{
            return this.num2-this.num1;
        }
        
    }
    public double multiply(){
        return this.num1*this.num2;
    }
    public double divide(){
        if(num2==0){
            return Double.NaN;
        }
        else{
        return this.num1/this.num2;
        }   
    }
    public double modulus(){
        if(this.num2==0){
            return Double.NaN;
        }
        else{
            return this.num1%this.num2;
        }
    }
    public double power(){
        return Math.pow(this.num1, this.num1);
    }
    public double average(){
        return (this.num1+this.num2/2);
    }
    public double max(){
        if(this.num1>this.num2){
            return this.num1;}
        else{
            return num2;
        }    
    }
    public double min(){
        if(this.num1<this.num2){
            return this.num1;}
        else{
            return num2;
        }  
    }
    public void Clear(){
        this.num1=0;
        this.num2=0;
    }
    public void Display(){
        System.out.printf("Num1= %.2f| Num2= %.2f\n", this.num1,this.num2);
    }
    @Override
    public String toString(){
        return "Calculator[ double num1= "+this.num1+" double num2= "+this.num2 + " ]";
    }    
}
