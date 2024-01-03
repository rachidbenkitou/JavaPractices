package functionalprogramming;

import java.util.function.Function;

public class HigherOrderFunctions {
    // Higher-order function taking a function as an argument
    public static <T, R> R applyFunction(Function<T, R> function, T value) {
        return function.apply(value);
    }

    // Higher-order function returning a function
    public static Function<Integer, Integer> multiplyBy(int factor) {
        return x -> x * factor;
    }

    // Higher-order function for composing two functions
    public static <T, R, U> Function<T, U> compose(Function<T, R> f, Function<R, U> g) {
        return x -> g.apply(f.apply(x));
    }
    public static void main(String[] args) {
        // Example: Using a higher-order function
        Function<Integer, String> intToString = Object::toString;
        String result = applyFunction(intToString, 42);
        System.out.println(result);  // Outputs: "42"

        // Example: Using a higher-order function to return a function
        Function<Integer, Integer> multiplyByTwo = multiplyBy(2);
        int result1 = multiplyByTwo.apply(5);
        System.out.println(result1);  // Outputs: 10

        // Example: Using a higher-order function for function composition
        Function<Integer, String> intToString2 = Object::toString;
        Function<String, Integer> stringToLength = String::length;
        Function<Integer, Integer> composedFunction = compose(intToString2, stringToLength);
        int result2 = composedFunction.apply(12345);
        System.out.println(result2);  // Outputs: 5
    }
}
