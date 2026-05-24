package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.printf("AVERAGE HEIGHT: %.2f%n", average(vect));

        sc.close();
    }

    public double average(double[] vect) {
        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        return sum / vect.length;
    }
}
