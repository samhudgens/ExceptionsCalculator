package com.samhudgens;

/**
 * Created by samhudgens on 5/17/16.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double divide(int numerator, int denominator) throws ArithmeticException{
        if(denominator==0) {
            throw new ArithmeticException();
        }
        return numerator/denominator;
    }



}
