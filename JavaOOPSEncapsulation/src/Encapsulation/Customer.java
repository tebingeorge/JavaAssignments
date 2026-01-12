package Encapsulation;

public class Customer {
	
		 private String name;
		 private int age;
		 public void setName(String name) {
		 this.name = name;
		 }
		 public void setAge(int age) {
		 if(age >= 18)
		 this.age = age;
		 }
		 public String getDetails() {
		 return "Name: " + name + ", Age: " + age;
		 }
		}


