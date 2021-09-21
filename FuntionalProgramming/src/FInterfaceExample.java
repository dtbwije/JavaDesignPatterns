import java.util.function.BiFunction;
import java.util.function.Function;

public class FInterfaceExample {

    public static class MathClass {
        public static Integer tripple(Integer i ){
            return i*3;
        }
    }
    public static void main(String... s){
        //using the clas
        Function<Integer, Integer> myTripple = MathClass::tripple;

        //using the simple labmda function with single
        Function<Integer, Integer> lamdaFunction = i -> i*3;

        // trying a labda funcito with two parameters
        BiFunction<String, Integer, Integer> stringFunctions = (word, multiplier) -> word.length() * multiplier;

        Integer result = myTripple.apply(5);
        System.out.println(result);

        System.out.println(lamdaFunction.apply(4));

        System.out.println(stringFunctions.apply("World this work", 5));
    }
}
