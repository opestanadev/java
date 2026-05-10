package applications;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
    void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        student.showStudentGrade();

        sc.close();
    }
}
