package calculator;

import calculator.service.Calculator;
import calculator.util.Operator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj operator:");
        Operator operator = Operator.fromString(scanner.next());
        try {
            double firstNumber = Double.parseDouble(scanner.next());
            double secondNumber = Double.parseDouble(scanner.next());
            System.out.println(Calculator.calculate(firstNumber, secondNumber, operator));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
