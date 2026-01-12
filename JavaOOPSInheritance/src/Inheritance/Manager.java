package Inheritance;

public class Manager extends Employee {
	 double bonus;
	 public static void main(String[] args) {
	 Manager m = new Manager();
	 m.salary = 40000;
	 m.bonus = 10000;
	 System.out.println("Total Salary: " + (m.salary + m.bonus));
	 }
	}