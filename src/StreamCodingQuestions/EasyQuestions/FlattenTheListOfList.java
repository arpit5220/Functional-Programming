package StreamCodingQuestions.EasyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenTheListOfList {

    public static void main(String[] args) {

        List<List<String>> list = new ArrayList<>();
        List<String> list1 = List.of("Arpit","Katiyar");
        List<String> list2 = List.of("Ankit","Katiyar");
        list.add(list1);
        list.add(list2);

        System.out.println(list);

        List<String> res = list.stream().flatMap(List::stream).toList();

        System.out.println(res);



    }
}
