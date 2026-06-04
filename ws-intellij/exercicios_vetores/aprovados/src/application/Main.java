package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        IO.print("Quantos alunos vão ser digitados? ");
        int n = sc.nextInt();
        
        Aluno[] alunos = new Aluno[n];

        for(int i = 0; i < n; i++) {
            IO.println("Informações do " + (i + 1) + "º aluno:");
            IO.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            IO.print("1ª nota: ");
            double primeiraNota = sc.nextDouble();
            IO.print("2ª nota: ");
            double segundaNota = sc.nextDouble();

            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        IO.println("ALUNOS APROVADOS:");
        for(int i = 0; i < n; i++) {
            if((alunos[i].primeiraNota + alunos[i].segundaNota) / 2 >= 6) {
                IO.println(alunos[i].nome);
            }
        }

        sc.close();
    }
}
