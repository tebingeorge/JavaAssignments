package com.test.unit_testing;
import static org.junit.Assert.*;
import org.junit.Test;
public class AgeValidator1Test {
@Test
public void testValidAge() {
AgeValidator1 av = new AgeValidator1();
assertTrue(av.validateAge(21));
}
@Test(expected = IllegalArgumentException.class)
public void testInvalidAge() {
AgeValidator1 av = new AgeValidator1();
av.validateAge(15);
}
}