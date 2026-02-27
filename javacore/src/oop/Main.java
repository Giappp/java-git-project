package oop;

/*
    Tạo class Student (name, age, score), tạo 3 object và in ra thông tin.
    Viết hàm tính điểm trung bình của danh sách sinh viên.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Create some Conflict");
        StudentRepo studentRepo = new StudentRepo();
        studentRepo.seedStudent();
        studentRepo.display();
        studentRepo.average();
    }
}
