package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProductWeight implements ValueObject<Double> {

    private Double productWeight;

    public ProductWeight(Double productWeight) {
        this.productWeight = Objects.requireNonNull(productWeight);
    }

    @Override
    public Double value() {
        return this.productWeight;
    }
}
