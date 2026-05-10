package application;

import entities.Triangle; // Para classes que pertecem a outros pacotes, é necessário fazer a importação.

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    void main() {
        // Exercício dos Triângulos com P.O.O. (Segunda versão)

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando e instanciando os objetos da classe Triangle
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        char larger = (areaX > areaY)? 'X' : 'Y';

        System.out.println();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println("Larger area: " + larger);

        sc.close();

        /* A ideia aqui é entender como podemos utilizar as classes no nosso programa ao invés de apenas criar uma variável para cada dado que vamos trabalhar (o que não é muito eficiente).
        *
        *  Posteriormente, iremos aprender (ou no meu caso, revisar) a tornar esse programa mais enxuto com classes, utilizando o conceito de métodos (isso, é claro, depois que eu ter a minha merecida noite de sono).
        *
        * Voltamos ainda hoje (posto este commit depois da meia noite) com a programação normal ;)
        * */
    }
}
