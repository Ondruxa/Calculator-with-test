package com.homework.calculator_test.service;


//import com.homework.calculator_test.exception.NumIsNull;
//import com.homework.calculator_test.exception.DividerIsNull;

import com.homework.calculator_test.exception.DividerIsNull;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (!(num1 == null || num2 == null)) {
            int num3 = num1 + num2;
            return num1 + " + " + num2 + " = " + num3;
        }
        throw new NullPointerException("один (оба) из параметров не определён(ы)");
    }

    public String minus(Integer num1, Integer num2) {
        if (!(num1 == null || num2 == null)) {
            int num3 = num1 - num2;
            return num1 + " - " + num2 + " = " + num3;
        }
        throw new NullPointerException("один (оба) из параметров не определён(ы)");
    }

    public String multiply(Integer num1, Integer num2) {
        if (!(num1 == null || num2 == null)) {
            int num3 = num1 * num2;
            return num1 + " * " + num2 + " = " + num3;
        }
        throw new NullPointerException("один (оба) из параметров не определён(ы)");
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DividerIsNull("Ошибка! Деление на ноль.");
        }
        if (!(num1 == null || num2 == null)) {
            double num3 = (double) num1 / (double) num2;
            return num1 + " / " + num2 + " = " + num3;
        }
        throw new NullPointerException("один (оба) из параметров не определён(ы)");
    }

}