package streamapi;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentRepo studentRepo = new StudentRepo();
        studentRepo.seedStudent();
        // lọc danh sách Student có điểm >= 7 và sắp xếp giảm dần theo điểm.
        System.out.println("Danh sách Student có điểm >= 7 và giảm dần");
        studentRepo.sortStudentByScore(7.0);

        System.out.println("Nhóm sinh viên theo tuổi");
        Map<Integer, List<Student>> studentGroupedByAge = studentRepo.groupStudentByAge();

        for (var entry : studentGroupedByAge.entrySet()) {
            System.out.println("Nhóm tuổi " + entry.getKey() + " : ");
            for (var s : entry.getValue()) {
                System.out.printf("Name %s, Age %d, Score %f\n", s.getName(), s.getAge(), s.getScore());
            }
        }
    }
}
