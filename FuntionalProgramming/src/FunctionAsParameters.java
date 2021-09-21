import funcitonasparm.Methods;

public class FunctionAsParameters {

    public static void main(String... a){
        Methods calculationMethods = new Methods();
        System.out.println(calculationMethods.combineAddMultiply(Methods::add,3,5));
        System.out.println(calculationMethods.combineAddMultiply(Methods::multiply,3,5));
    }
}
