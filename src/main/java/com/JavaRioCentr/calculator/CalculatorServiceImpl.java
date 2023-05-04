package com.JavaRioCentr.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String welcome() {
        return "Добро пожаловать";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num2 == null && num1 == null) {
            return "Введите оба числа";
        } else if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }

        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num2 == null && num1 == null) {
            return "Введите оба числа";
        } else if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }

        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num2 == null && num1 == null) {
            return "Введите оба числа";
        } else if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }

        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num2 == null && num1 == null) {
            return "Введите оба числа";
        } else if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        } else if (num2 == 0) {
            return "Деление на ноль невозможно";
        }
        return String.format("%.0f / %.0f = %.2f", num1, num2, num1 / num2);

    }
}
