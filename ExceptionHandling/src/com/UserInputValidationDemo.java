package com;

public class UserInputValidationDemo {
	 public static void main(String[] args) {
	 int age = 15;
	 try {
	 if(age < 18) {
	 throw new Exception("Not eligible to vote");
	 }
	 } catch (Exception e) {
	 System.out.println(e.getMessage());
	 }
	 }
	}
