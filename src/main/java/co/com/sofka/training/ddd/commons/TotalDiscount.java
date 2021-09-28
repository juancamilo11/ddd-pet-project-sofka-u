package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

public class TotalDiscount implements ValueObject<Double> {

    private Double totalDiscount;

    public TotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @Override
    public Double value() {
        return this.totalDiscount;
    }
}