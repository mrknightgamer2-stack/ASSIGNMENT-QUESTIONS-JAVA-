public class student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;// default is false
    student(String name, int age, double gpa){
        this.name= name;
        this.age= age;
        this.gpa=gpa;
        this.isEnrolled= true;
    }
    void study(){
        System.out.println(this.name+" is studying");
    }
}
