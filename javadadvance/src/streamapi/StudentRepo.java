package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRepo {
    private final List<Student> students;

    StudentRepo() {
        students = new ArrayList<>();
    }

    public void seedStudent() {
        students.addAll(StudentUtility.demoStudent());
    }

    public void sortStudentByScore(double scoreThreshold) {
        List<Student> sortedStudent = students
                .stream()
                .filter(student -> student.getScore() >= scoreThreshold)
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .toList();
        for (Student s : sortedStudent) {
            System.out.printf("Name %s, Age %d, Score %f\n", s.getName(), s.getAge(), s.getScore());
        }
    }

    public Map<Integer, List<Student>> groupStudentByAge() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
    }
}
