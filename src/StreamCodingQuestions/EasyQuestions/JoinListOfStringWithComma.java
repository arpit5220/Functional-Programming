package StreamCodingQuestions.EasyQuestions;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStringWithComma {

    public static void main(String[] args) {

        List<String> list = List.of("Arpit", "Ankit", "Mradul");

        String res = list.stream()
                .collect(Collectors.joining(",","[","]"));

        System.out.println(res);
    }
}
