package Encapsulation;

public class Employee {
	private int empId;
	 private double salary;
	 public void setEmpId(int empId) {
	 this.empId = empId;
	 }
	 public void setSalary(double salary) {
	 if(salary > 0)
	 this.salary = salary;
	 }
	 public void displaySalary() {
	 System.out.println("Salary: " + salary);
	 }
	}



