package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {

        // Vai instanciar uma data-[hora] local pegando a data atual (sem o horário)
        LocalDate d01 = LocalDate.now();

        System.out.println("d01 = " + d01);

        // Faz o mesmo só que pegando o horário
        LocalDateTime d02 = LocalDateTime.now();

        System.out.println("d02 = " + d02);

        // Instancia uma data-hora global (com fuso horário)
        Instant d03 = Instant.now();

        System.out.println("d03 = " + d03); // Por padrão, ele sempre vai mostrar a hora no fuso horário de Londres

        LocalDate d04 = LocalDate.parse("2026-07-01");

        System.out.println("d04 = " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2026-07-01T15:26:56");

        System.out.println("d05 = " + d05);

        Instant d06 = Instant.parse("2026-07-01T15:26:56Z");

        System.out.println("d06 = " + d06);

        Instant d07 = Instant.parse("2026-07-01T15:26:56-03:00");

        System.out.println("d07 = " + d07);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("01/07/2026", fmt1);

        System.out.println("d08 = " + d08);

        // Formatando a partir de dados isolados
        LocalDate d09 = LocalDate.of(2026, 07, 01);

        System.out.println("d09 = " + d09);

    }
}
