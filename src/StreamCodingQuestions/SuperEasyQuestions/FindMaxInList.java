package StreamCodingQuestions.SuperEasyQuestions;

import java.util.List;

public class FindMaxInList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,12,34,56,11);

        long max = list.stream()
                .reduce(0,(a,b)-> Integer.max(a,b));

        System.out.println(max);
    }
}
