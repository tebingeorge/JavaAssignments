package com;

public class RethrowExceptionDemo {
	 public static void main(String[] args) {
	 try {
	 try {
	 int a = 10 / 0;
	 } catch (ArithmeticException e) {
	 System.out.println("Caught exception");
	 throw e;
	 }
	 } catch (ArithmeticException e) {
	 System.out.println("Rethrown exception handled");
	 }
	 }
	}