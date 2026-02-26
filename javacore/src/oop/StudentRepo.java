package oop;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private final List<Student> students;

    StudentRepo() {
        students = new ArrayList<>();
    }

    public void seedStudent() {
        students.addAll(StudentUtility.demoStudent());
    }

    public void display() {
        for (Student s : students) {
            System.out.printf("Name %s, Age %d, Score %f\n", s.getName(), s.getAge(), s.getScore());
        }
    }

    public void average() {
        double sum = students.stream()
                .mapToDouble(Student::getScore)
                .sum();

        System.out.println("Average Point: " + sum / students.size());
    }
}
