package StreamCodingQuestions.SuperEasyQuestions;

import java.util.List;

public class FindFirstGreaterFromList {

    public static void main(String[] args) {

        // Find first no from list greate than 10
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,12,34,56,11);

//        Optional<Integer> res = list.stream()
//                .filter(x-> x>10)
//                .sorted()
//                .findFirst();
//        System.out.println(res.get());


        // count number greater than 5
        long res = list.stream()
                .filter(x-> x>5)
                .count();

        System.out.println(res);

    }
}
