package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        IO.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        int menoresDe16;
        double somaAltura, percentualMenores;

        for(int i = 0; i < n; i++) {
            IO.println("Dados da " + (i + 1) + "a pessoa:");

            IO.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            IO.print("Idade: ");
            int idade = sc.nextInt();

            IO.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        // A partir daqui eu precisei de um pouco de ajuda da correção, presente neste link: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java

        somaAltura = 0;
        menoresDe16 = 0;
        for(int i = 0; i < n; i++) {
           somaAltura += pessoas[i].altura;
           if(pessoas[i].idade < 16) {
               menoresDe16++;
           }
        }

        percentualMenores = ((double) menoresDe16 / n) * 100;

        IO.println();
        IO.println("Altura média: " + String.format("%.2f", somaAltura / n));
        IO.println("Pessoas com menos de 16 anos: " + String.format("%.1f%%", percentualMenores));

        for(int i = 0; i < n; i++) {
            if(pessoas[i].idade < 16) {
                IO.println(pessoas[i].nome);
            }
        }

        sc.close();
    }
}
