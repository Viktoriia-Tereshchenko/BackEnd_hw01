package calculator.infra;

import calculator.model.Calculator;

import java.lang.reflect.Method;

public class CalculatorUtils {

    public static void calculate(double a, double b, String mathOperation) {
        Class<Calculator> clazz = Calculator.class;
        double result;
        try {
            Method method = clazz.getMethod(mathOperation, double.class, double.class);
            System.out.println(method.invoke(new Calculator(), a, b));
        } catch (Exception e) {
            System.out.println("Invalid mathematical operation");
        }
    }
}