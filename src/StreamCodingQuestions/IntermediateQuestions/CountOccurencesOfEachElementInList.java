package StreamCodingQuestions.IntermediateQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurencesOfEachElementInList {

    public static void main(String[] args) {

        List<Employe> employees = Arrays.asList(
                new Employe(50000, "IT", "Amit"),
                new Employe(65000, "IT", "Neha"),
                new Employe(45000, "HR", "Rahul"),
                new Employe(52000, "HR", "Priya"),
                new Employe(70000, "Finance", "Karan"),
                new Employe(58000, "Finance", "Sneha")
        );


        Map<String,Double> res = employees.stream()
                        .collect(Collectors.groupingBy(
                                 Employe::getDepartment,
                                 Collectors.averagingDouble(Employe::getSalary)
                        ));

        System.out.println(res);
    }
}

class Employe{

    int salary;
    String department;
    String name;

    public Employe(int salary, String department, String name) {
        this.salary = salary;
        this.department = department;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
