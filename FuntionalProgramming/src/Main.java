import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String... a) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (x, y, z) -> x + y + z;

        System.out.println(triFunction.apply(1, 2, 4));

        TriFunction<String, String, String, Integer> secondTriFunction = (x, y, z) -> x.length() + y.length() + z.length();

        System.out.println(secondTriFunction.apply("Dayan", "Tharanga", "Bandara"));

        BiFunction<Integer, Integer, Integer> devidFunction = (x, y) -> (x / y);

        Function<BiFunction<Integer, Integer, Integer>, BiFunction<Integer, Integer, Integer>> testFunciton = func -> (x, y) -> {
            if (y < 1) {
                System.out.println("ERROR");
            }
            return func.apply(x,y);
        };

        BiFunction testFunctoinAsParms = testFunciton.apply(devidFunction.apply(3,4));
    }
}
