
package com.test.unit_testing;
public class RethrowService {
public void process() {
try {
int a = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Logging exception");
throw e;
}
}
}
