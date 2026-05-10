package entities;

public class Student {
    public String name;
    public double firstGrade, secondGrade, thirdGrade;

    public double calculateAverage() { // Embora não seja o que a questão pede, optei por usar o sistema de notas brasileiro.
        return (firstGrade + secondGrade + thirdGrade) / 3;
    }

    public void showStudentGrade() {
        System.out.println("FINAL GRADE = " + String.format("%.1f", calculateAverage()));
        if (calculateAverage() >= 6) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.1f POINTS", 6 - calculateAverage());
        }
    }
}
