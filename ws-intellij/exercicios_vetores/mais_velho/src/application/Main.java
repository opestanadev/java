package application;

import entities.Pessoa;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        String pessoaMaisVelha = "";
        int maior = 0;

        for(int i = 0; i < n; i++) {
            IO.println("Dados da " + (i + 1) + "ª pessoa:");
            IO.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            IO.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);

            if(pessoas[i].idade > maior) {
                maior = pessoas[i].idade;
                pessoaMaisVelha = pessoas[i].nome;
            }
        }

        IO.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);

        sc.close();
    }
}
