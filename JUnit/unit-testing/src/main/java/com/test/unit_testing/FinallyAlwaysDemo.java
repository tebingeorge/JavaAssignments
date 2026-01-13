package com.test.unit_testing;
public class FinallyAlwaysDemo {
public static void main(String[] args) {
try {
int a = 10 / 5;
} finally {
System.out.println("Finally block executed");
}
}
}