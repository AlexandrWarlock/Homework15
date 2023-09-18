package com.alexandrwarlock.calculator.service;

import com.alexandrwarlock.calculator.exception.DivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 = 1;
        int num2 = 2;
        long result = calculatorService.plus(num1, num2);
        assertEquals(num1 +num2, result);
    }

    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2IsBiggerThanNum1() {
        int num1 = 1;
        int num2 = -5;
        long result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @Test
    void minus_shouldReturnPositiveNumWhenNum1IsPositiveAndNum2IsPositive() {
        int num1 = 1;
        int num2 = 2;
        long result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @Test
    void minus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2IsBiggerThanNum1() {
        int num1 = 1;
        int num2 = -3;
        long result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @Test
    void divide_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 = 1;
        int num2 = 2;
        double result = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }
    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2IsBiggerThanNum1() {
        int num1 = 1;
        int num2 = -5;
        double result = calculatorService.divide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }

    @Test
    void divide_shouldThrowExceptionWhenNum2IsNull() {
        int num1 = 1;
        int num2 = 0;
        DivideException result = assertThrows(DivideException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals("Деление на 0 недоступно", result.getMessage());

    }


    @Test
    void multiply_shouldReturnNumWhenNum1IsPositiveAndNum2IsPositive() {
        int num1 = 1;
        int num2 = 2;
        long result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }
    @Test
    void multiply_shouldReturnNumWhenNum1IsPositiveAndNum2IsNegative() {
        int num1 = 1;
        int num2 = -2;
        long result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }
}