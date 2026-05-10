package applications;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + String.format("%.2f", rectangle.calculateArea()));
        System.out.println("PERIMETER = " + String.format("%.2f", rectangle.calculatePerimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.calculateDiagonal()));

        sc.close();
    }
}
