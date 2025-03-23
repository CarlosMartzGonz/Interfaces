package Ejercicio1;

import java.time.LocalDate;

public class GeneralWorker extends Worker{
    private float overtime;
    private double euroPerHour;

    public GeneralWorker(String id, LocalDate birthaday, String surname, String personName,
                         LocalDate startDay, TypeWorker typeWorker,
                         float overtime, double euroPerHour) throws TypeWorkerException {
        super(id, birthaday, surname, personName, startDay, typeWorker);
        if (typeWorker.equals(TypeWorker.GENERAL)) {
            this.overtime = overtime;
            this.euroPerHour = euroPerHour;
        } else {
            throw  new TypeWorkerException();
        }
    }

    public float getOvertime() {
        return overtime;
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;
    }

    public double getEuroPerHour() {
        return euroPerHour;
    }

    public void setEuroPerHour(double euroPerHour) {
        this.euroPerHour = euroPerHour;
    }

    @Override
    public double getSalary() {
        return BASIC_SALARY + getTypeWorker().getComplement() + overtime * euroPerHour;
    }

    @Override
    public String getInformation() {
        return String.format("%s;%s", super.getInformation(), Turn.MORNING) ;
    }
}
