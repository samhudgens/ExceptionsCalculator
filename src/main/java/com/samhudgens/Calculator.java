package com.samhudgens;

/**
 * Created by samhudgens on 5/17/16.
 */
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double divide(int numerator, int denominator) throws DivideByZeroException{
        if(denominator==0) {
            throw new DivideByZeroException();
        }
        return numerator/denominator;
    }

    public static double squareRoot(double a) {
        if(a<0) {
            throw new ComplexNumberException();
        }
        return Math.sqrt(a);
    }
}
