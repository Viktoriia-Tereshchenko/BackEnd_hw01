package calculator;

import calculator.infra.CalculatorUtils;

public class CalculatorAppl {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Incorrect number of arguments");
            return;
        }
        try {
            CalculatorUtils.calculate(
                    Double.parseDouble(args[0]),
                    Double.parseDouble(args[1]),
                    args[2]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
