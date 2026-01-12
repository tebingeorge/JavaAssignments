package polymorphism;
public class Login {
 void login(String email) {
 System.out.println("Email login: " + email);
 }
 void login(String email, String password) {
 System.out.println("Email: " + email + ", Password: " + password);
 }
 public static void main(String[] args) {
 Login l = new Login();
 l.login("user@mail.com");
 l.login("admin@mail.com", "admin123");
 }
}