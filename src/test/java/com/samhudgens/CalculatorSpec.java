package com.samhudgens;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by samhudgens on 5/17/16.
 */
public class CalculatorSpec {

    Calculator calculator;


    @Before
    public void initialize() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        int expected = 14;
        int actual = calculator.add(5,9);
        assertEquals("should add the numbers together", expected, actual);
    }

    @Test
    public void subtractTest() {
        int expected = 8;
        int actual = calculator.subtract(10,2);
        assertEquals("subtract the second number from the first", expected, actual);
    }

    @Test
    public void multiplyTest() {
        int expected = 24;
        int actual = calculator.multiply(4,6);
        assertEquals("multiply the numbers together", expected, actual);
    }

    @Test
    public void divideTest() {
        double expected = 4;
        double actual = calculator.divide(24,6);
        assertEquals("divide the first number by the second", expected, actual, 0.0000001);
    }

    @Test(expected = DivideByZeroException.class)
    public void divideByZeroTest() {
        double actual = calculator.divide(2,0);
        assertEquals("should throw error", true, actual);
    }

    @Test(expected = ComplexNumberException.class)
    public void ComplexNumberTest() {
        double actual = calculator.squareRoot(-7);
        assertEquals("should throw complex number error", true, actual);
    }


}
