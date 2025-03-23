package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public abstract class Worker extends Person implements Employed{
    private TypeWorker typeWorker;
    private final LocalDate startDay;

    public Worker(String id, LocalDate birthaday, String surname, String personName,
                  LocalDate startDay, TypeWorker typeWorker) {
        super(id, birthaday, surname, personName);
        this.startDay = startDay;
        this.typeWorker = typeWorker;
    }

    public static TypeWorker getTypeWorker() {
        return typeWorker;
    }

    public void setTypeWorker(TypeWorker typeWorker) {
        this.typeWorker = typeWorker;
    }

    public LocalDate getStartDay() {
        return startDay;
    }
    public int getWorkedYears() {
        return Period.between(startDay, LocalDate.now()).getYears();
    }
    @Override
    public String getInformation() {
        return String.format("%s;%s;%.2f", toString(), typeWorker, getSalary());
    }
}
