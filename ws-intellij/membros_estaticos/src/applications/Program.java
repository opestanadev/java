package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14159; // Constante PI - Membro estático (constante se declara usando final e deve ser sempre em maiúsculo)

    void main() {

        // Utilizando funções dentro do próprio programa principal para resolver o problema.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4 * PI * Math.pow(radius, 3) / 3;
    }
}
