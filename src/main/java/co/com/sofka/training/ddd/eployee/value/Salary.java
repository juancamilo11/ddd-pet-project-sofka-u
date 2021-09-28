package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.ValueObject;

public class Salary implements ValueObject<Double> {

    private Double salary;

    public Salary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Double value() {
        return this.salary;
    }
}
