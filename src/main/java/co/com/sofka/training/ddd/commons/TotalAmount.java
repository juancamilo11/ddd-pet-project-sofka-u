package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalAmount implements ValueObject <Double> {

    private Double totalAmount;

    public TotalAmount(Double totalAmount) {
        this.totalAmount = Objects.requireNonNull(totalAmount);
    }

    @Override
    public Double value() {
        return this.totalAmount;
    }
}
