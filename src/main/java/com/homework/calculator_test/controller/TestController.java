package com.homework.calculator_test.controller;

import com.homework.calculator_test.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class TestController {

    private final CalculatorService calculatorService;

    public TestController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting(){
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String plus(
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2){
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2){
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2){
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(
            @RequestParam("num1") Integer num1,
            @RequestParam("num2") Integer num2){
        return calculatorService.divide(num1, num2);
    }

}

