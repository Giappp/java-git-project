package oop;

import java.util.List;

public class StudentUtility {
    public static List<Student> demoStudent() {
        Student s1 = new Student("A", 18, 8.0);
        Student s2 = new Student("A", 19, 7.5);
        Student s3 = new Student("A", 20, 8.5);
        return List.of(s1, s2, s3);
    }
}
