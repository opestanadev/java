package application;

import entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    void main() {

        // Reutilizando o código de exercicio_estoque usando construtores

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: $ ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        // Ao definir um construtor com parâmetros, eu evito a criação de objetos vazios, que é o ideal no nosso código.

        System.out.println();

        System.out.println("Product data: " + product);

        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();

        System.out.print("Updated data: " + product);

        sc.close();

        /* DETALHE IMPORTANTE
        *
        *  Se um construtor customizado não tivesse sido criado, a própria classe já disponibilizaria um construtor vazio.
        * */
    }
}
