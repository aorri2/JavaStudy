package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentStreamExample {
    public static void main(String[] args) {
        Student student1 = new Student("wook",50,90);
        Student student2 = new Student("yum",23,85);
        Student student3 = new Student("jin",16,98);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        StudentStreamExample sample = new StudentStreamExample();
        sample.printStudentNameAndScore(studentList);

    }
    public void printStudentNameAndScore(List<Student> students){
        students.stream().map(student -> student.toString()).forEach(student-> System.out.println(student));
    }
}
