package com;

public class MultipleCustomExceptionDemo {
	 public static void main(String[] args) {
	 int age = 16;
	 try {
	 if(age < 18) {
	 throw new InvalidAgeException("Age not valid");
	 }
	 } catch (InvalidAgeException e) {
	 System.out.println(e.getMessage());
	 }
	 }
	}