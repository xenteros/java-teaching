package calculator.service;

import calculator.util.Operator;

/**
 * Created by agurgul on 20.06.2017.
 */
public class Calculator {

    public static double calculate(double first, double second, Operator operator) {

        if (operator == null) {
            throw new IllegalArgumentException("Unknown operator");
        }

        switch (operator) {
            case ADD:
                return add(first, second);

            case DIFF:
                return diff(first, second);

            case MULTIPLY:
                return multiply(first, second);

            case DIVIDE:
                return divide(first, second);

            case MODULO:
                return modulo(first, second);

            case POW:
                return pow(first, second);
        }

        throw new UnsupportedOperationException(operator.toString());
    }

    private static double add(double first, double second) {
        return first + second;
    }

    private static double diff(double first, double second) {
        return first - second;
    }

    private static double multiply(double first, double second) {
        return first * second;
    }

    private static double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("0 division not allowed");
        }
        return first / second;
    }

    private static double modulo(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("0 division not allowed");
        }
        return first % second;
    }

    private static double pow(double first, double second) {
        return Math.pow(first, second);
    }
}
