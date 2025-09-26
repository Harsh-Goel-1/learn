package OOPS.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Sachin = new Student(95, 68);
        Student Vedansh = new Student(28, 82);
        Student Harsh = new Student(11, 71);
        Student[] students = {Sachin, Vedansh, Harsh};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rollno - o2.rollno;
            }
        });
        System.out.println(Arrays.toString(students));

        // lambda expression / in-line / one line function is "->"
        Arrays.sort(students, (Student o1, Student o2) -> -(o1.rollno - o2.rollno));
        System.out.println(Arrays.toString(students));
    }
}
