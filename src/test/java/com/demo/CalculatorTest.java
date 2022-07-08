package com.demo;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    Calculator c1 = new Calculator();

    @Test
    public void addTest()
    {
        assertEquals( 30,c1.add(10,20));
    }

    @Test
    public void subTest()
    {
        assertEquals( -30, c1.sub(10,40));
    }
}
