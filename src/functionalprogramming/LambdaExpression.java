package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExpression {
    // Function to transform a list using a lambda expression
    private static <T, R> List<R> transformList(List<T> list, Function<T, R> mapper) {
        return list.stream()
                .map(mapper)
                .collect(Collectors.toList());
    }

    // Function to transform a list using a lambda expression
    private static <T, R> List<R> transformListNumbers(List<T> list, Function<T, R> mapper) {
        return list.stream()
                .map(mapper)
                .collect(Collectors.toList());
    }

    // Lambda expression to multiply a number by a factor
    private static int multiplyByFactor(int number, int factor) {
        return number * factor;
    }
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        // Using Function and lambda expression to multiply each number by 2
        List<Integer> multipliedNumbers = transformListNumbers (numbers1, x -> multiplyByFactor(x, 2));
        // Print the result
        System.out.println("Multiplied Numbers: " + multipliedNumbers);


        List<String> names = Arrays.asList("John", "Alice", "Bob", "Eva");
        // Using Function and lambda expression to transform names to uppercase
        List<String> uppercaseNames = transformList(names, String::toUpperCase);
        // Print the result
        System.out.println("Uppercase Names: " + uppercaseNames);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Using a lambda expression to square each number
        numbers.forEach(number -> System.out.println(number * number));


        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Orange");
        // Using a lambda expression to filter words starting with "A"
        words.stream()
                .filter(word -> word.startsWith("A"))
                .forEach(System.out::println);
    }
}

