package functionalprogramming;
@FunctionalInterface
interface NoArgFunction<T> {
    T apply();
}
public class Closure {
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Rachid";
            return () -> "Hello " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());  // Outputs: Hello Rachid
    }
}
