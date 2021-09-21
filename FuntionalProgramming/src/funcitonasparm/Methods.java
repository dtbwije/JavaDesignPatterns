package funcitonasparm;

import java.util.function.BiFunction;

public class Methods {
    public static Integer add(int x, int y){
        return x + y;
    }

    public static Integer multiply(int x, int y) {
        return x*y;
    }

    public Integer combineAddMultiply(BiFunction<Integer, Integer, Integer> myFunction, int x,int y){
        return myFunction.apply(x,y);
    }
}
