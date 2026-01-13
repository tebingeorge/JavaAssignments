package com.test.unit_testing;
public class GenericExceptionDemo {
public static void main(String[] args) {
try {
int[] a = new int[2];
a[5] = 10;
} catch (Exception e) {
System.out.println("Generic exception handled");
}
}
}