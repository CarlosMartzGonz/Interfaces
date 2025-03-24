package Ejercicio1;

public interface Employed {
    double BASIC_SALARY = 1_200;
    double getSalary();
    String getInformation();

    default double getSalaryWithTaxex(){

        if (getSalary() >= 1000 && getSalary( ) <= 1500)
            return getSalary() * 0.95;
        else if (getSalary() >= 1501 && getSalary() <= 2000 )
            return getSalary() * 0.93;
        else if (getSalary() >=2501 && getSalary() <= 2500)
            return getSalary() * 0.90;
        else
            return getSalary() * 0.86;
    }
}
