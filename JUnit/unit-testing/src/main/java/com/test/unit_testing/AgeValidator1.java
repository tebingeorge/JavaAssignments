package com.test.unit_testing;


public class AgeValidator1 {
public boolean validateAge(int age) {
if (age < 18) {
throw new IllegalArgumentException("Age not eligible");
}
return true;
}
}
