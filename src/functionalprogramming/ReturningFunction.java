package functionalprogramming;

import java.util.function.Function;

public class ReturningFunction {
    public static void main(String[] args) {
        // Returning a function in Java
        Function<Integer, Function<Integer, Integer>> multiplier = factor -> x -> x * factor;

        // Applying the returned function
        Function<Integer, Integer> multiplyByTwo = multiplier.apply(2);
        int result = multiplyByTwo.apply(5);
        System.out.println("Result: " + result);  // Outputs: Result: 10
    }
}
