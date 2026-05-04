public class OOP_student {
    public static void main(String[] args) {
        student student1= new student("Ali", 18, 3.2);
        student student2= new student("Ayan", 20, 2.9);
        student student3= new student("Maryam",19,3.9);
        System.out.println(student1.name);
        System.out.println(student1.age);

        System.out.println(student2.name);
        System.out.println(student2.gpa+" gpa");
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.gpa+" gpa");
        System.out.println(student3.isEnrolled);

        student1.study();
    }

}
