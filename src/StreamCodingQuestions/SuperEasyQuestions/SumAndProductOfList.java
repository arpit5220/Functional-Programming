package StreamCodingQuestions.SuperEasyQuestions;

import java.util.List;

public class SumAndProductOfList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,4,5,6,8,9);

        // Sum of List
        long sum = list.stream()
                .reduce(0,(a,b)-> a+b);

        System.out.println(sum);

        // Product Of List
        long product = list.stream()
                .reduce(1,(a,b)-> a*b);

        System.out.println(product);

    }
}
