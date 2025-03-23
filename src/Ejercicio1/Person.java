package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String personName;
    private String surname;
    private final String id;
    private final LocalDate birthaday;

    public Person(String id, LocalDate birthaday, String surname, String personName) {
        this.id = id;
        this.birthaday = birthaday;
        this.surname = surname;
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public LocalDate getBirthaday() {
        return birthaday;
    }
    public int getAge() {
        Period period = Period.between(birthaday, LocalDate.now());
        return period.getYears();
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d", id, surname, personName, getAge());
    }
}
