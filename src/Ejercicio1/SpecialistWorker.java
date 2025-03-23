package Ejercicio1;

import java.time.LocalDate;

public final class SpecialistWorker extends Worker{
    private Turn turn;

    public SpecialistWorker(String id, LocalDate birthaday, String surname, String personName,
                            LocalDate startDay, TypeWorker typeWorker,
                            Turn turn) throws TypeWorkerException {
        super(id, birthaday, surname, personName, startDay, typeWorker);
        if ( ! typeWorker.equals(TypeWorker.GENERAL) )
            this.turn = turn;
        else throw new TypeWorkerException();
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    @Override
    public double getSalary() {
        return BASIC_SALARY + getTypeWorker().getComplement();
    }

    @Override
    public String getInformation() {
        return String.format("%s;%s", super.getInformation(), turn);
    }
}
