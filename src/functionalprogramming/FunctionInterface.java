package functionalprogramming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterface {
    public static class Person {
        public static  Integer CalculateTriple(Integer number){
            return number*3;
        }
    }
    public static void main(String[] args) {
        Function<Integer, Double> add= (x)->x*2.5;
        System.out.println(add.apply(5));

        Function<Integer, Integer> calculateTriple=Person::CalculateTriple;
        System.out.println(calculateTriple.apply(5));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Using Function to square each number in a stream
        List<Integer> squaredNumbers = numbers.stream()
                .map(squareFunction)
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);


    }
    // Define a Function to square a number
    private static final Function<Integer, Integer> squareFunction = x -> x + x;
}