package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String [] args){

        List<Student> list = new ArrayList<>();
        list.add(new Student("Arpit",90));
        list.add(new Student("Anuj",80));
        list.add(new Student("Ankit",60));

        Collections.sort(list);
        for(Student s: list){
            System.out.println(s.name + "-->" + s.score);
        }


    }
}

class Student implements Comparable<Student> {
     String name;
     Integer score;


    public  Student(String name, Integer score){
        this.name=name;
        this.score=score;
    }


    @Override
    public int compareTo(Student other) {
       // return this.score - other.score;
       // return this.name.compareTo(other.name);
        return this.score.compareTo(other.score);
    }
}
