package Functional_Interface;


import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String [] args){
        Supplier<Integer> s = () -> 2*2;
        System.out.println(s.get());
    }
}
