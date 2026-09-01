public class Circle{
    private Point center;
    private float radius;
    private static int obj;
    
    Circle(){
        this.center= new Point(0.0f,0.0f);
        this.radius= 1.0f;
        obj++;
    }

    Circle(Point center,float radius){
        this.center= center;
        this.radius= radius;
        obj++;
    }

    Circle(Circle clone){
        this.center= new Point(clone.getCenter());
        this.radius= clone.getRadius();
        obj++;
    }

    public Point getCenter(){
        return new Point(this.center);
    }

    public float getRadius(){
        return this.radius;
    }

    public void setVals(Point center,float radius){
        this.center= center;
        this.radius= radius;
    }

    public static int obj_count(){
        return this.obj;
    }

    public float diameter(){
        float dia= this.radius*2;
        return dia; 
    }

    public float area(){
        float r= this.getRadius();
        float area= (float) (Math.PI*(Math.pow(r,2)));
        return area;
    }

    public float circumference(){
        float r= this.getRadius();
        float cir= (float)(2*Math.PI*r);
        return cir;
    }

    public boolean containPoint(Point other){
        float cx= this.getCenter().getX();
        float cy= this.getCenter().getY();
        float X= other.getX();
        float Y= other.getY();
        float difx= X-cx;
        float dify= Y-cy;
        float inx= (float) Math.pow(difx,2);
        float iny= (float) Math.pow(dify,2);
        float add= inx + iny;
        float distance= (float) Math.sqrt(add);
        return distance<=this.radius;
    }

    public boolean intersectsCircle(Circle other){
        float distance= (float) Math.sqrt((Math.pow(other.getCenter().getX()-this.getCenter().getX(),2)) + (Math.pow(other.getCenter().getY()-this.getCenter().getY(),2)));
        return distance<= (this.radius+other.radius);
    }

}