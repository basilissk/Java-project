package com.test.test1;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void isTwoPlusThreeEqualsFive(){

        assertEquals(5, calculator.addTwoNumbers(2, 3));
    }
    @Test
    public void isSevenMinusFourEqualsThree(){

        assertEquals(3, calculator.substractTwoNumbers(7, 4));
    }
    @Test
    public void isThreeMultiplyFourEqualsTwelve(){
        assertEquals(12, calculator.miltiplicateTwoNumbers(3, 4));
    }
    @Test
    public void isTenDivideTwoEqualsFive(){
        assertEquals(5, calculator.divideTwoNumbers(10, 2), 0.000001);
    }
}
