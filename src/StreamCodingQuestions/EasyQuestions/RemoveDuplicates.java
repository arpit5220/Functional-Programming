package StreamCodingQuestions.EasyQuestions;

import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = List.of(2,5,6,6,8,9,9);

        List<Integer> res = list.stream()
                .distinct().toList();

        System.out.println(res);

    }
}
