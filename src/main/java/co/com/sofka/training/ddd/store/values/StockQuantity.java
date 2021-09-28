package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

public class StockQuantity implements ValueObject<Integer> {

    private Integer stockQuantity;

    public StockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public Integer value() {
        return this.stockQuantity;
    }
}
