package com.test.unit_testing;
public class RethrowMain {
public static void main(String[] args) {
try {
new RethrowService().process();
} catch (Exception e) {
System.out.println("Exception rethrown and caught");
}
}
}