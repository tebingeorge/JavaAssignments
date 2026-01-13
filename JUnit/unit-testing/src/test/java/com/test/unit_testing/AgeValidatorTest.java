package com.test.unit_testing;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import org.junit.Test;
public class AgeValidatorTest {
 @Test
 public void testEligibleAge() {
 AgeValidator av = new AgeValidator();
 assertTrue(av.isEligible(20));
 }
 @Test
 public void testNotEligibleAge() {
 AgeValidator av = new AgeValidator();
 assertFalse(av.isEligible(15));
 }
}