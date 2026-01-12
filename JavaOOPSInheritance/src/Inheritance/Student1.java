package Inheritance;

public class Student1 extends Person1 {
	 int rollNo;
	 Student1(String name, int rollNo) {
	 super(name);
	 this.rollNo = rollNo;
	 }
	 public static void main(String[] args) {
	 Student1 s = new Student1("Anita", 201);
	 System.out.println("Name: " + s.name);
	 System.out.println("Roll No: " + s.rollNo);
	 }
	}
