package com.test.unit_testing;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import org.junit.Test;
public class LoginServiceTest {
 @Test
 public void testValidLogin() {
 LoginService ls = new LoginService();
 assertTrue(ls.login("admin", "admin123"));
 }
 @Test
 public void testInvalidLogin() {
 LoginService ls = new LoginService();
 assertFalse(ls.login("user", "pass"));
 }
}