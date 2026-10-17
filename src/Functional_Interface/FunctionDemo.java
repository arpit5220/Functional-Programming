package Functional_Interface;


import java.util.function.Function;

public class FunctionDemo {

    public static void main(String [] args){
        Function<Integer,Integer> f = (a)-> a*a;
        System.out.println(f.apply(6));
    }
}
