package application;

import entities.Triangle;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    void main() {
        // Terceira versão do exercício do Triângulo, usando métodos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

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

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();

        char larger = (areaX > areaY)? 'X' : 'Y';

        System.out.println();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println("Larger area: " + larger);

        sc.close();

        /* Ao analisar as três versões do mesmo programa, observa-se o seguinte:
        *
        *  1º Programa: Não possui orientação a objetos, toda a lógica do programa, incluindo os dados que vamos trabalhar
        *  é feito no código principal, fazendo necessário crar várias variáveis, gerando um código ineficiente.
        *
        *  2º Programa: Agora, utilizamos a orientação a objetos ao criar uma classe Triângulo que vai possuir os atributos
        *  necessários para o nosso código. Agora, quando queremos criar trabalhar com um triângulo, basta instanciar um objeto
        *  da classe Triangle que ele já vai receber os atributos que queremos, sendo um pouco mais eficiente. O problema dessa
        *  versão se deve ao fato de que toda a lógica de cálculo da área é feito no código principal, o que torna o código redundante
        *  já que como temos dois triângulos, temos que repetir o exato mesmo bloco de código duas vezes (se tivessem mais triângulo, essa repetição ocorreria mais vezes ainda).
        *
        *  3º Programa: Agora, toda lógica para que se possa calcular a área é feita pela própria classe, que é o ideal, tornando o código
        *  mais enxuto e eficiente com a utilização de métodos.
        * */
    }
}
