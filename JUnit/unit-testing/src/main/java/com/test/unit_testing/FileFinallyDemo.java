package com.test.unit_testing;


public class FileFinallyDemo {
public static void main(String[] args) {
try {
System.out.println("File opened");
} catch (Exception e) {
System.out.println("Exception occurred");
} finally {
System.out.println("File closed");
}
}
}
