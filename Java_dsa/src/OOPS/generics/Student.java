package OOPS.generics;

public class Student implements Comparable<Student>{
    int rollno;
    int marks;

    Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    // Arrays.sort() uses compareTo from implementation of Comparable class
    // if compareTo return negative value then (this) object is deemed smaller than student object
    @Override
    public int compareTo(Student student) {
        return this.marks - student.marks;
    }

    @Override
    public String toString() {
        return rollno + " " + marks;
    }
}
