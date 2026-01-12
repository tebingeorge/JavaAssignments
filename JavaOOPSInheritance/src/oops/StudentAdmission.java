package oops;
public class StudentAdmission {
 String type;
 StudentAdmission() {
 type = "General Admission";
 }
 StudentAdmission(int marks) {
 type = marks >= 80 ? "Merit Admission" : "General Admission";
 }
 void display() {
 System.out.println(type);
 }
 public static void main(String[] args) {
 StudentAdmission s1 = new StudentAdmission();
 StudentAdmission s2 = new StudentAdmission(85);
 s1.display();
 s2.display();
 }
}