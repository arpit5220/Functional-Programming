package Functional_Interface;


import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String [] args){
        Predicate<Integer> p = (a)-> true;
        System.out.println(p.test(6));
    }
}
