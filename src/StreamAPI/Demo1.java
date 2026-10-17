package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Demo1 {

    public static void main(String [] args){

//        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//
//        Stream<Integer> s = list.stream();
//        s.filter(x-> x%2==0)  // predicate
//                .map(x-> x*2)  // function
//                .forEach(x-> System.out.println(x)); // consumer



//        List<Integer> list = new ArrayList<>(List.of(2,4,5,6,7,8));
//
//        list.stream()
//                .filter(x-> x<10)
//                .filter(x -> x%2==0)
//                .map(x -> x*3)
//                .forEach(x -> System.out.println(x));


        // flatMap

//        List<List<Integer>> list = List.of(
//                List.of(5,7),
//                List.of(9,7)
//        );
//
//        list.stream()
//                .flatMap(x-> x.stream()) // flatMap -> flattening operation
//                .map(x-> x*x)
//                .sorted((a,b)-> b-a)  // stateful
//                .distinct()  // keep unique values (Hashing) -> stateful
//                .forEach(x -> System.out.println(x));



//        Stream.iterate(2, x->x+1)
//                .limit(10)
//                .peek(x-> System.out.print(x + " peek vala: "))
//                .skip(5)
//                .forEach(System.out::println);  // not considered output got



        // -------> collect()
//        List<Integer> list = new ArrayList<>(List.of(2,4,5,6,7,8));
//        List<Integer> list2 = list.stream()
//                .map(x-> x*2)
//                //.toList();  // non-mutalbe
//                        .collect(Collectors.toList()); // mutable
//
//
//        //list2.add(10);
//        System.out.println(list2);



          List<Integer> list = new ArrayList<>(List.of(2,4,5,6,7,8));
          int sum  = list.stream()
                  .reduce(0,(a,b)-> a+b);
          System.out.println(sum);






    }
}

// intermediate operation ---------------->
//filter
//map
//flatMap
//distinct()
//sorted()
// limit()
// skip()
// peek()          ------------------------>

// ------------  terminal operation
// forEach(), forEachOrdered()
// toList()
// collect ()
// reduce() -> combine stream elements into single values
// count()
// findfirst()
// findAny()
// anyMatch()
