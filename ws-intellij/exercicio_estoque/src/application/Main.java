package application;

import entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: $ ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

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

        /* INFORMAÇÕES IMPORTANTES
        *
        *  No Java, toda classe é uma subclasse da classe Object (vamos entender sobre subclasse mais tarde)
        *  Isso significa, que qualquer classe que a gente criar vai herdar os métodos dessa classe Object. Um
        *  desses métodos é o toString(), que converte o objeto para uma String.
        *
        *  Por padrão, se pedirmos para o compilador imprimir o objeto (como o product), ele vai imprimir algo parecido com isso:
        *
        *  entities.Product@2f92e0f4
        *
        *  Isso é o endereço (ou referência) do objeto na memória do nosso computador. Mas como eu posso alterar isso, para ele
        *  mostrar meu objeto de outra maneira? Para isso, vamos na nossa classe Product e sobrescrever o toString() da classe Object
        *  (tudo isso vai ficar mais claro posteriormente). Basta ver a forma que eu fiz na classe, assim sempre que chamarmos o nosso
        *  objeto, ele vai retornar exatamente o que eu pedi no toString(), que vai ser algo parecido com isso:
        *
        *  TV, $ 900.00, 10 units, Total: $ 9000.00
        *
        *  Agora, quando eu quero imprimir os dados do meu produto no console, basta eu chamá-lo, que ele já vai retornar dessa forma, poupando um pouquinho do nosso código.
         * */
    }
}
