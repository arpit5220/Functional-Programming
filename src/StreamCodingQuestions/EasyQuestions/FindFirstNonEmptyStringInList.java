package StreamCodingQuestions.EasyQuestions;

import java.util.List;
import java.util.Optional;

public class FindFirstNonEmptyStringInList {

    public static void main(String[] args) {

        List<String> list = List.of("","","Arpit", "Ankit", "Mradul");

        Optional<String> res = list.stream()
                .filter(x-> !x.isEmpty())
                .findFirst();

        System.out.println(res.get());
    }
}
