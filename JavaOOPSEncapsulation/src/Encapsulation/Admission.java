package Encapsulation;

public class Admission {
	private int marks;
	 private String grade;
	 public void setMarks(int marks) {
	 this.marks = marks;
	 if(marks >= 90) grade = "A";
	 else if(marks >= 75) grade = "B";
	 else if(marks >= 60) grade = "C";
	 else grade = "Fail";
	 }
	 public String getGrade() {
	 return grade;
	 }

}
