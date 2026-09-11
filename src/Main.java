import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // fun(List.of(1, 2, 3, 4, 5, 6,6,7,8));

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

        courses.stream()
                // .filter(course -> course.length()>=4)
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    public static void fun(List<Integer> numbers) {
//        for(int number:numbers)
//        {
//            System.out.println(number);
//        }

        numbers.stream()
                //.filter(Main::isEven) // only allows even elements
                .filter(number -> number%2 ==0)  // Lambda Expression
                .forEach(Main::print); // Method Reference
    }

    private static void print(int number)
    {
        System.out.println(number);
    }

    private static boolean isEven(int number)
    {
        return number%2 == 0;
    }
}