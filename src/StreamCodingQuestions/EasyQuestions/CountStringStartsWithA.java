package StreamCodingQuestions.EasyQuestions;

import java.util.List;
import java.util.Optional;

public class CountStringStartsWithA {

    public static void main(String[] args) {

        List<String> list = List.of("Arpit", "Ankit", "Mradul");

        long res = list.stream()
                .filter(x-> x.startsWith("A"))
                        .count();

        System.out.println(res);

    }
}
