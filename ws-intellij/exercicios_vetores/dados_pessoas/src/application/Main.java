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
        double menorAltura, maiorAltura, somaAlturaMulheres = 0, mediaAlturaMulheres;
        int numeroHomens = 0;

        for(int i = 0; i < n; i++) {
            IO.println("Dados da " + (i + 1) + "ª pessoa:");
            IO.print("Altura: ");
            double altura = sc.nextDouble();
            IO.print("Gênero (M/F): ");
            char genero = sc.next().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);

        }

        menorAltura = pessoas[0].altura;
        maiorAltura = pessoas[0].altura;

        for(int i = 0; i < n; i++) {
            if (pessoas[i].altura > maiorAltura) {
                maiorAltura = pessoas[i].altura;
            } else if (pessoas[i].altura < menorAltura) {
                menorAltura = pessoas[i].altura;
            }

            if(pessoas[i].genero == 'M') {
                numeroHomens++;
            } else {
                somaAlturaMulheres += pessoas[i].altura;
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / (n - numeroHomens);

        IO.println("Menor altura: " + String.format("%.2f", menorAltura));
        IO.println("Maior altura: " + String.format("%.2f", maiorAltura));
        IO.println("Média da altura das mulheres: " + String.format("%.2f", mediaAlturaMulheres));
        IO.println("Número de homens: " + numeroHomens);

        sc.close();
    }
}
