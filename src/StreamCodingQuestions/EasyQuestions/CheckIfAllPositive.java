package StreamCodingQuestions.EasyQuestions;

import java.util.List;

public class CheckIfAllPositive {

    public static void main(String[] args) {

        List<Integer> list = List.of(3,4,5,6,7,-1);


    //    CheckIfAllPositive
//        boolean res = list.stream()
//                .allMatch(x-> x>0);
//        System.out.println(res);


        // CheckIfAny divisible by 3
        boolean res = list.stream()
                .anyMatch(x-> x%3==0);
        System.out.println(res);
    }
}
