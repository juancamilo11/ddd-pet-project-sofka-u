package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalDiscount implements ValueObject<Double> {

    private Double totalDiscount;

    public TotalDiscount(Double totalDiscount) {
        this.totalDiscount = Objects.requireNonNull(totalDiscount);
    }

    @Override
    public Double value() {
        return this.totalDiscount;
    }
}