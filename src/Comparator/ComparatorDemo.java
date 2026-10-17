package Comparator;


import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{

     public static void main(String [] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("Arpit",90,141));
        list.add(new Student("Anuj",80,143));
        list.add(new Student("Ankit",60,234));

        Comparator<Student> byname = new SortByName();
        Comparator<Student> byRollno = new SortByRollNo();
        Comparator<Student> byMarks = new SortByMarks();


       // Collections.sort(list,byMarks);
        Collections.sort(list,(s1,s2) -> s1.rollNo - s2.rollNo);
        for(Student s :list){
           System.out.println(s.name + " " + s.rollNo + " " + s.marks);
        }
     }
}

class SortByName implements Comparator<Student>{

     @Override
     public int compare(Student o1, Student o2) {
        return  o1.name.compareTo(o2.name);
     }
}

class SortByRollNo implements Comparator<Student>{

     @Override
     public int compare(Student o1, Student o2) {
          return o1.rollNo-o2.rollNo;
     }
}

class SortByMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
     return o1.marks-o2.marks;
    }
}



class Student {

      String name;
      int rollNo;
      int marks;

      public Student(String name, int rollNo, int marks){
             this.name=name;
             this.rollNo=rollNo;
             this.marks=marks;
      }

}
