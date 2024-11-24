package com.homework.calculator_test.service;

import com.homework.calculator_test.exception.DividerIsNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void plus() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " + " + num2 + " = " + 15;

        //when
        String actualResult = calculatorService.plus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void plusWithNull() {
        //given
        Integer num1 = null;
        Integer num2 = 5;

        //when
        //then
        Assertions.assertThrows(
                NullPointerException.class,
                () -> calculatorService.plus(num1, num2)
        );
    }

    @Test
    void minus() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " - " + num2 + " = " + 5;

        //when
        String actualResult = calculatorService.minus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void minusWithNull() {
        //given
        Integer num1 = null;
        Integer num2 = 5;

        //when
        //then
        Assertions.assertThrows(
                NullPointerException.class,
                () -> calculatorService.minus(num1, num2)
        );
    }

    @Test
    void multiply() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " * " + num2 + " = " + 50;

        //when
        String actualResult = calculatorService.multiply(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiplyWithNull() {
        //given
        Integer num1 = null;
        Integer num2 = 5;

        //when
        //then
        Assertions.assertThrows(
                NullPointerException.class,
                () -> calculatorService.multiply(num1, num2)
        );
    }

    @Test
    void divide() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " / " + num2 + " = " + 2.0;

        //when
        String actualResult = calculatorService.divide(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideWithNull() {
        //given
        Integer num1 = null;
        Integer num2 = 5;
        //when
        //then
        Assertions.assertThrows(
                NullPointerException.class,
                () -> calculatorService.divide(num1, num2)
        );
    }

    @Test
    void shouldThrowExceptionWhenNum2IsZero() {
        //given
        Integer num1 = 10;
        Integer num2 = 0;
        //when
        //then
        Assertions.assertThrows(
                DividerIsNull.class,
                () -> calculatorService.divide(num1, num2)
        );
    }
}