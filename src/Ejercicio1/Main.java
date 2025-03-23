package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try {
            Worker plumber1 = new SpecialistWorker("12345678a", LocalDate.of(2000, 6, 28),
                    "molina molina", "gabriel", LocalDate.of(2015, 1, 1),
                    TypeWorker.PLUMBER, Turn.NIGHT);
            System.out.println(plumber1.getInformation());
        } catch (TypeWorkerException e) {
            throw new RuntimeException(e);
        }
        try {
            Worker general1 = new GeneralWorker("12345678a", LocalDate.of(2000, 6, 28),
                    "molina molina", "gabriel", LocalDate.of(2015, 1, 1),
                    TypeWorker.PLUMBER, 10, 10.5);
            System.out.println(general1.getInformation());
        } catch (TypeWorkerException e) {
            System.err.println(e.getMessage());;
        }
        try {
            Worker general2 = new GeneralWorker("12345678a", LocalDate.of(2000, 6, 28),
                    "molina molina", "gabriel", LocalDate.of(2015, 1, 1),
                    TypeWorker.GENERAL, 10, 10.5);
            System.out.println(general2.getInformation());
        } catch (TypeWorkerException e) {
            System.err.println(e.getMessage());;
        }
    }
}