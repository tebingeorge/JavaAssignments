package oops;
public class User {
 String email, password;
 User(String email) {
 this.email = email;
 this.password = "default";
 }
 User(String email, String password) {
 this.email = email;
 this.password = password;
 }
 void display() {
 System.out.println(email + " " + password);
 }
 public static void main(String[] args) {
 User u1 = new User("user@mail.com");
 User u2 = new User("admin@mail.com", "admin123");
 u1.display();
 u2.display();
 }
}