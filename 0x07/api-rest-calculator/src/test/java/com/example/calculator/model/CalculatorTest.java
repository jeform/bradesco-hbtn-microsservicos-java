package com.example.calculator.model;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        assertEquals(5.0, calculator.sum(2.0, 3.0));
    }

    @Test
    void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 2.0));
        assertThrows(NullPointerException.class, () -> calculator.sum(2.0, null));
    }

    @Test
    void subTest() {
        assertEquals(1.0, calculator.sub(3.0, 2.0));
    }

    @Test
    void divideTest() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
    }

    @Test
    void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(2.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(101, calculator.integerToBinary(5));
        assertEquals(1, calculator.integerToBinary(1));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("A", calculator.integerToHexadecimal(10));
        assertEquals("1", calculator.integerToHexadecimal(1));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate d1 = LocalDate.of(2020, 3, 15);
        LocalDate d2 = LocalDate.of(2020, 3, 29);
        assertEquals(14, calculator.calculeDayBetweenDate(d1, d2));
    }
}
