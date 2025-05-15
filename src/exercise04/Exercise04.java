package exercise04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        // Tạo danh sách sinh viên
        studentList.add(new Student("Alice", 20, "A1", 8.5));
        studentList.add(new Student("Bob", 21, "A1", 7.0));
        studentList.add(new Student("Charlie", 19, "A2", 9.0));
        studentList.add(new Student("David", 22, "A2", 6.5));
        studentList.add(new Student("Eve", 20, "A1", 8.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm min: ");
        double min = scanner.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = scanner.nextDouble();

        // Hiển thị danh sách sinh viên trong khoảng điểm
        System.out.println("Danh sách sinh viên có điểm trung bình từ " + min + " đến " + max + ":");
        for (Student student : studentList) {
            if (student.getAvgScore() >= min && student.getAvgScore() <= max) {
                System.out.println(student);
            }
        }

        scanner.close();
    }
}
