package StreamCodingQuestions.EasyQuestions;

import java.util.List;

public class FindAvg {

    public static void main(String[] args) {

        List<Integer> list = List.of(3,4,5,6,7);

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);
    }
}
