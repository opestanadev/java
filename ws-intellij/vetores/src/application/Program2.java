package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        System.out.printf("AVERAGE PRICE: %.2f%n", average(vect));

        sc.close();
    }

    public static double average(Product[] vect) {
        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        return sum / vect.length;
    }
}
