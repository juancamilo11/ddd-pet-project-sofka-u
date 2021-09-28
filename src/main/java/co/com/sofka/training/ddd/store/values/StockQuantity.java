package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StockQuantity implements ValueObject<Integer> {

    private Integer stockQuantity;

    public StockQuantity(Integer stockQuantity) {
        this.stockQuantity = Objects.requireNonNull(stockQuantity);
    }

    @Override
    public Integer value() {
        return this.stockQuantity;
    }
}
