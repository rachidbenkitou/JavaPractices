package functionalprogramming;

import java.util.function.Function;

public class FunctionAsArgument {
    public static void main(String[] args) {
        // Passing a function as an argument
        double result = calculate(5, x -> x * x);  // Squaring function
        System.out.println("Result: " + result);  // Outputs: Result: 25.0
    }

    // Higher-order function taking a function as an argument
    private static double calculate(double value, Function<Double, Double> operation) {
        return operation.apply(value);
    }
}
