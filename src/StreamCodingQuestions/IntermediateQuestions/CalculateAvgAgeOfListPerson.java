package StreamCodingQuestions.IntermediateQuestions;

import java.util.List;

public class CalculateAvgAgeOfListPerson {

    public static void main(String[] args) {
        List<Person> list = List.of(new Person(20, "Ankit"),
                new Person(24,"Arpit"),
                new Person(35,"Ayush"),
                new Person(47,"Anuj")
        );

        double avg = list.stream().
        mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}

class Person{

    int age;
    String name;

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
