package com.homework.calculator_test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceTestParameterized {

    private final CalculatorService calculatorService = new CalculatorService();

    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                Arguments.of(10, 20),
                Arguments.of(0, 3),
                Arguments.of(-10, 6),
                Arguments.of(1, 2000),
                Arguments.of(7, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void plus(Integer num1, Integer num2) {
        //given
        Integer result = num1 + num2;
        String expectedResult = num1 + " + " + num2 + " = " + result;

        //when
        String actualResult = calculatorService.plus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void minus(Integer num1, Integer num2) {
        //given
        Integer result = num1 - num2;
        String expectedResult = num1 + " - " + num2 + " = " + result;

        //when
        String actualResult = calculatorService.minus(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void multiply(Integer num1, Integer num2) {
        //given
        Integer result = num1 * num2;
        String expectedResult = num1 + " * " + num2 + " = " + result;

        //when
        String actualResult = calculatorService.multiply(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void divide(Integer num1, Integer num2) {
        //given
        double result = (double) num1 / (double) num2;
        String expectedResult = num1 + " / " + num2 + " = " + result;

        //when
        String actualResult = calculatorService.divide(num1, num2);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
