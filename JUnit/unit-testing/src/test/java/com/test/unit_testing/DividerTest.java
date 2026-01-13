package com.test.unit_testing;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import org.junit.Test;
public class DividerTest {
 @Test(expected = ArithmeticException.class)
 public void testDivideByZero() {
 Divider d = new Divider();
 d.divide(10, 0);
 }
}