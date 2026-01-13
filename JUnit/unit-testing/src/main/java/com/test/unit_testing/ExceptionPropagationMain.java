package com.test.unit_testing;
public class ExceptionPropagationMain {
public static void main(String[] args) {
try {
ExceptionPropagationDemo d = new ExceptionPropagationDemo();
d.divide();
} catch (ArithmeticException e) {
System.out.println("Exception propagated and handled");
}
}
}