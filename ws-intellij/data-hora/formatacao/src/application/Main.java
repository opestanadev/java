package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2026-07-18");
        LocalDateTime d02 = LocalDateTime.parse("2026-07-18T15:30:11");
        Instant d03 = Instant.parse("2026-07-18T15:30:11Z");

        // DateTimeFormatter serve para criar uma formatação de como a data-hora vai ser escrita (pelo menos é o que deu pra entender)
        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // data-[hora] local (sem horário)
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // data-[hora] local (com horário)
        DateTimeFormatter format03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // data-hora global, pegando o fuso-horário do sistema do usuário

        System.out.println("d01 = " + d01.format(format01)); // Imprime usando o padrão/formatação armazenado em format01
        System.out.println("d01 = " + format01.format(d01));

        System.out.println();

        System.out.println("d02 = " + d02.format(format01));
        System.out.println("d02 = " + d02.format(format02));

        System.out.println();

        System.out.println("d03 = " + format03.format(d03)); // Para Instant, deve-se chamar o mét-odo .format()
    }
}
