package oops;
public class Student {
 int id;
 String name;
 void displayDetails() {
 System.out.println(id + " " + name);
 }
 public static void main(String[] args) {
 Student s = new Student();
 s.id = 101;
 s.name = "Rahul";
 s.displayDetails();
 }
}
