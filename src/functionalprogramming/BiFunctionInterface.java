package functionalprogramming;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        // Example of using BiFunction to concatenate two strings
        BiFunction<String, String, String> concatenateFunction = (s1, s2) -> s1 + s2;

        String result = concatenateFunction.apply("Hello, ", "World!");
        System.out.println(result);  // Outputs: Hello, World!


        // Example of using BiFunction to find the maximum of two numbers
        BiFunction<Integer, Integer, Integer> maxFunction = Math::max;

        int result1 = maxFunction.apply(10, 7);
        System.out.println("Maximum of 10 and 7 is: " + result1);  // Outputs: Maximum of 10 and 7 is: 10
    }
}
