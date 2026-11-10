package StreamCodingQuestions.IntermediateQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumberInEvenOdd {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        Map<Boolean,List<Integer>> res = list.stream().
        collect(Collectors.partitioningBy(n-> n%2==0));

        System.out.println("even" + res.get(true)); // 2,4,6,8
        System.out.println("odd" + res.get(false)); // 1,3,5,7

    }
}
