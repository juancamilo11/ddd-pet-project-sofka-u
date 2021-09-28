package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

public class DiscountPercent implements ValueObject<Double> {
    private final Double percentDiscount;

    public DiscountPercent(Double percentDiscount){
        this.percentDiscount = percentDiscount;
    }

    @Override
    public Double value() {
        return this.percentDiscount;
    }
}
