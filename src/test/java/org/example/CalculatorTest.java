package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        int x = 5;
        int y = 5;
        int expected = 10;
        int result = calculator.add(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtraction() {
        int x = 10;
        int y = 5;
        int expected = 5;
        int result = calculator.subtraction(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiply() {
        int x = 10;
        int y = 5;
        int expected = 50;
        int result = calculator.multiply(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void divide() {
        int x = 10;
        int y = 5;
        int expected = 2;
        int result = calculator.divide(x, y);
        Assertions.assertEquals(expected, result);
    }
}