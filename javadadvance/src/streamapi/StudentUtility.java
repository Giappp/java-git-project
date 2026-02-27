package streamapi;

import java.util.List;

public class StudentUtility {
    public static List<Student> demoStudent() {
        Student s1 = new Student("A", 18, 8.0);
        Student s2 = new Student("B", 19, 7.5);
        Student s3 = new Student("C", 20, 8.5);
        Student s4 = new Student("D", 20, 6.5);
        Student s5 = new Student("E", 20, 5.5);
        Student s6 = new Student("F", 20, 7.0);
        Student s7 = new Student("G", 20, 9.5);
        Student s8 = new Student("H", 20, 3.5);
        Student s9 = new Student("J", 20, 2.5);
        Student s10 = new Student("K", 20, 9.0);
        return List.of(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
    }
}
