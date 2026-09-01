public class Vector{
    private float x;
    private float y;
    private static int obj;

    Vector(){
        this.x=0.0f;
        this.y=0.0f;
        obj++;
    }

    Vector(float x,float y){
        this.x=x;
        this.y=y;
        obj++;
    }
    
    Vector(Vector clone){
        this.x=clone.x;
        this.y=clone.y;
        obj++;
    }

    public void setVals(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public static int obj_count(){
        return obj;
    }

    public boolean equals(Vector other){
        if(this.x==other.x && this.y==other.y){
            return true;
        }
        else{
            return false;
        }
    }

    public Vector addVector(Vector other){
        float newX= this.x + other.x;
        float newY= this.y + other.y;
        return new Vector(newX,newY);
    }

    public Vector subtractVector(Vector other){
        float newX= other.x - this.x;
        float newY= other.y - this.y;
        return new Vector(newX,newY);
    }

    public Vector scaleVector(int multiplier){
        float newX= this.x * multiplier;
        float newY= this.y * multiplier;
        return new Vector(newX,newY);
    }

    public float magnitude(){
        double sqX= Math.pow(this.x,2);
        double sqY= Math.pow(this.y,2);
        float mag= (float) Math.sqrt(sqX+sqY);
        return mag;
    }

    public float getDirectionRad(){//calculates direction between two vectors returns answer in radians -pi to pi
        float radians= (float)Math.atan2(this.y,this.x);
        return radians;
    }

    public float getDirectionDeg(){//calculates direction between two vectors returns answer in degrees -180 to 180
        float radians= getDirectionRad();
        float degrees= (float) Math.toDegrees(radians);
        if(degrees<0){
            degrees+=360.0f;
        }
        return degrees;
    }

    public float dotProduct(Vector other){
        float X1X2= this.x * other.x;
        float Y1Y2= this.y * other.y;
        float result= X1X2 + Y1Y2;
        return result;
    }

    public float crossProduct(Vector other){// points into imaginary z-axis
        float X1X2= this.x * other.x;
        float Y1Y2= this.y * other.y;
        float result= X1X2 - Y1Y2;
        return result;
    }

    public void display(){
        System.out.println(toString());
        }    

    @Override
     public String toString(){
       String msg=String.format("\nx= %.2f, y= %.2f, Objects= %d",this.x,this.y,obj);
        return msg; 
     }
    
}
