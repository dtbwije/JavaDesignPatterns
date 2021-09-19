import java.net.Inet4Address;
import java.util.function.Function;
public class FInterfaceExample {

    public static class MathClass {
        pubic static Integer tripple(Integer i ){
            return i*3;
        }
    }
    public static void main(String s){
        Function<Integer, Integer> myTripple = MathClass::tripple;
        Integer result = myTripple.apply(t::6);
        System.out.println(result);
    }
}
