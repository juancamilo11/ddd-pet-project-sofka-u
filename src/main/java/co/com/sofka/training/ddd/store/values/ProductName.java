package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProductName implements ValueObject<String> {

    private String productName;

    public ProductName(String ProductName) {
        this.productName = Objects.requireNonNull(productName);
    }

    @Override
    public String value() {
        return this.productName;
    }
}