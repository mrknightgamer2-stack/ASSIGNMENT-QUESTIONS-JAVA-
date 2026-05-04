public class OOP_User {
    public static void main(String[] args) {
    User user1= new User("Muhammad");
    User user2= new User("Saif","saif12yo@gmail.com",30);
    User user3= new User();
    System.out.println(user1.username);
    System.out.println(user1.email);
    System.out.println(user1.age);
    System.out.println();
    System.out.println(user2.username);
    System.out.println(user2.email);
    System.out.println(user2.age);
    System.out.println();
    System.out.println(user3.username);
    System.out.println(user3.email);


    }

}
