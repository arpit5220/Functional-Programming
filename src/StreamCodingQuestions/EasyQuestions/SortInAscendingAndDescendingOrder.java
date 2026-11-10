package StreamCodingQuestions.EasyQuestions;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortInAscendingAndDescendingOrder {

    public static void main(String[] args) {

        List<Integer> list = List.of(2,5,6,6,8,9,9,3,4,1,5,6,2);

        List<Integer> res = list.stream()
                .sorted()  // ascending
                .sorted((a,b) -> b-a).toList(); // descending


        System.out.println(res);
    }
}
