package com.test.unit_testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(5, 5));
    }
}
