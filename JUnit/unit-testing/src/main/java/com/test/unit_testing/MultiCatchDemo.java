package com.test.unit_testing;
public class MultiCatchDemo {
public static void main(String[] args) {
try {
int a = 10 / 0;
} catch (ArithmeticException | NullPointerException e) {
System.out.println("Multiple exception handled");
}
}
}
