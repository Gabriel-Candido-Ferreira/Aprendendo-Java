import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate dataLocal = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();
        Instant dataHoraGlobal = Instant.now();

        LocalDate dataIso = LocalDate.parse("2024-07-29");
        LocalDateTime dataHoraIso =  LocalDateTime.parse("2024-07-29T04:45:15");
        Instant dataFusoHIso = Instant.parse("2024-07-29T04:45:15Z");

        System.out.println(dataLocal);
        System.out.println(dataHora);
        System.out.println(dataHoraGlobal); //gera uma data hora global, referente ao fuso horário de londres
        System.out.println(dataIso);
        System.out.println(dataHoraIso);
        System.out.println(dataFusoHIso);

        //Calculos

        LocalDate d01 = LocalDate.parse("2024-02-02");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-02T01:20:26");
        Instant d03 = Instant.parse("2024-02-02T01:20:26Z");

        LocalDate pasWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        LocalDateTime pasWeekLocalDatetime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDatetime = d02.plusDays(7);

        Instant pasWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pasWeekLocalDate :" + pasWeekLocalDate);
        System.out.println("nextWeekLocalDate :" + nextWeekLocalDate);
        System.out.println("pasWeekLocalDatetime :" + pasWeekLocalDatetime);
        System.out.println("nextWeekLocalDatetime :" + nextWeekLocalDatetime);
        System.out.println("pasWeekInstant :" + pasWeekInstant);
        System.out.println("nextWeekInstant :" + nextWeekInstant);


        //Duracao

        Duration t1 = Duration.between(pasWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pasWeekLocalDatetime, d02);
        Duration t3 = Duration.between(pasWeekInstant, d03);
        Duration t4 = Duration.between(d03, pasWeekInstant);

        System.out.println("t1 dias :" + t1.toDays());
        System.out.println("t2 dias :" + t2.toDays());
        System.out.println("t3 dias :" + t3.toDays());
        System.out.println("t4 dias :" + t4.toDays());
    }
}