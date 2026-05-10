package applications;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    void main() {

        // Versão final, utilizando membros estáticos na classe Calculator, sem que seja necessário instanciar um objeto.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", Calculator.PI);

        sc.close();
    }
}
