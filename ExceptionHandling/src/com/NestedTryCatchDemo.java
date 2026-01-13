package com;

public class NestedTryCatchDemo {
	 public static void main(String[] args) {
	 try {
	 try {
	 int a = 10 / 0;
	 } catch (ArithmeticException e) {
	 System.out.println("Inner catch");
	 }
	 int[] arr = new int[3];
	 arr[5] = 10;
	 } catch (ArrayIndexOutOfBoundsException e) {
	 System.out.println("Outer catch");
	 }
	 }
	}
