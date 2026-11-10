package StreamCodingQuestions.IntermediateQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfEmployeeBySalary {

    public static void main(String[] args) {

        List<Employee> list = List.of(new Employee(10000, "Ankit"),
                new Employee(20000,"Arpit"),
                new Employee(3000,"Ayush"),
                new Employee(40000,"Anuj")
                );

      //  List<Employee> res = list.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        List<Employee> res = list.stream().sorted(Comparator.comparing((Employee e) -> e.salary).reversed()).toList();// without method reference
        System.out.println(res);

    }
}

class Employee{

    int salary;
    String name;

    public Employee(int salary,String name){
        this.salary=salary;
        this.name=name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
