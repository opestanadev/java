package application;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt();
            if(n > 10) {
                System.out.println("ERRO: Não pode haver mais que 10 números");
            }
        } while (n > 10);

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                System.out.println(nums[i]);
            }
        }

        sc.close();
    }
}
