public class Main {
    public static void main(String... a){
        TriFunction<Integer,Integer,Integer,Integer> triFunction = (x,y,z) -> x+y+z;

        System.out.println(triFunction.apply(1,2,4));

        TriFunction<String, String,String, Integer> secondTriFunction = (x,y,z) -> x.length() + y.length() + z.length();

        System.out.println(secondTriFunction.apply("Dayan", "Tharanga", "Bandara"));
    }
}
