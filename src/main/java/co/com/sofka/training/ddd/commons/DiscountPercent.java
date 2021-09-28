package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DiscountPercent implements ValueObject<Double> {
    private final Double percentDiscount;

    public DiscountPercent(Double percentDiscount){
        this.percentDiscount = Objects.requireNonNull(percentDiscount);
    }

    @Override
    public Double value() {
        return this.percentDiscount;
    }
}
