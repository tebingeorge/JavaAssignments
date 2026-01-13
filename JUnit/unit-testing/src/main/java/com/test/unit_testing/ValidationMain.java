package com.test.unit_testing;

public class ValidationMain {
public static void main(String[] args) {
try {
new ValidationService().validate("abc");
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}