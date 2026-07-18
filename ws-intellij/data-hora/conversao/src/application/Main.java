package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2026-07-18");
        LocalDateTime d02 = LocalDateTime.parse("2026-07-18T15:30:11");
        Instant d03 = Instant.parse("2026-07-18T15:30:11Z");

        LocalDate result01 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate result02 = LocalDate.ofInstant(d03, ZoneId.of("Japan"));

        System.out.println("result01 = " + result01);
        System.out.println("result02 = " + result02);

        System.out.println();

        System.out.println("d02 - ano = " + d02.getYear());
        System.out.println("d02 - mês = " + d02.getMonth());
        System.out.println("d02 - dia = " + d02.getDayOfMonth());
        System.out.println("d02 - dia da semana = " + d02.getDayOfWeek());
        System.out.println("d02 - hora = " + d02.getHour());
        System.out.println("d02 - minuto = " + d02.getMinute());
        System.out.println("d02 - segundo = " + d02.getSecond());

    }
}
