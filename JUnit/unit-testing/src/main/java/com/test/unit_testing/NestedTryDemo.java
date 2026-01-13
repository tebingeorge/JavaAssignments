package com.test.unit_testing;

public class NestedTryDemo {
public static void main(String[] args) {
try {
try {
int a = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Inner catch: ArithmeticException");
}
} catch (Exception e) {
System.out.println("Outer catch");
}
}
}