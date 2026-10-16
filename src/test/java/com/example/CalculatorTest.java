package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(10, new Calculator().add(4, 6));
    }

    @Test
    public void testMultiplication() {
        assertEquals(24, new Calculator().multiply(4, 6));
    }
}