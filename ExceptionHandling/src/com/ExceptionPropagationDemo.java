package com;

public class ExceptionPropagationDemo {
	 static void m() {
	 int a = 10 / 0;
	 }
	 static void n() {
	 m();
	 }
	 public static void main(String[] args) {
	 try {
	 n();
	 } catch (ArithmeticException e) {
	 System.out.println("Exception handled in main");
	 }
	 }
	}
