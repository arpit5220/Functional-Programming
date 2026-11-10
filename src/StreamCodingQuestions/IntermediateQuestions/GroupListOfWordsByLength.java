package StreamCodingQuestions.IntermediateQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfWordsByLength {

    public static void main(String[] args) {

        List<String> list = List.of("Arpit","Anuj","Mradul","Ankit","Sonu","Arjun","Pulkit","Abhishek");

        Map<Integer,List<String>> res= list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(res);
    }
}
