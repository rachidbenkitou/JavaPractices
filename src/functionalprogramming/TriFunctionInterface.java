package functionalprogramming;

public class TriFunctionInterface {
    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        TriFunction<Integer, Double, String, String> formatFunction =
                (integer, aDouble, str) -> String.format("Result: %d, %.2f, %s", integer, aDouble, str);
        String result = formatFunction.apply(42, 3.14, "Java");
        System.out.println(result);  // Outputs: Result: 42, 3.14, Java


        TriFunction<Double, Double, Double, Double> calculateVolume =
                (length, width, height) -> length * width * height;
        double volume = calculateVolume.apply(5.0, 3.0, 2.0);
        System.out.println("Volume of the box: " + volume);  // Outputs: Volume of the box: 30.0
    }
}
