package StreamCodingQuestions.SuperEasyQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String [] args){

         // List -> Stream
         List<String> list = List.of("Arpit", "Katiyar","Ankit");
         //list.stream().forEach(System.out::println);
         List<String> res = list.stream().collect(Collectors.toList());
         //System.out.println(res);

         // Array -> Stream
          String [] arr = new String [] {"arpit", "ankit", "anuj"};
          int val = Math.toIntExact(Arrays.stream(arr).count());
          System.out.println(val);

          // Stream of Integer
          Stream<Integer> integerStream = Stream.of(1,2,3);
          



    }
}
