package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
+
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.dollarToReal(dollarPrice, amount));

        sc.close();

        /* ERROS QUE TIVE ENQUANTO RESOLVIA O EXERCÍCIO
        *
        *  Na constante IOF, eu converti erroneamente 6% para 0.6 (60%), o que fez com que eu tivesse uma saída diferente da esperada.
        *
        *  De resto, apenas alterei os nomes para os que estavam no exercício corrigido porque os nomes que eu escolhi eram péssimos.
        * */
    }
}
