package com;

public class CustomExceptionDemo {
	 public static void main(String[] args) {
	 int balance = 500;
	 try {
	 if(balance < 1000) {
	 throw new InvalidBalanceException("Insufficient balance");
	 }
	 } catch (InvalidBalanceException e) {
	 System.out.println(e.getMessage());
	 }
	 }
	}
