package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProductCategory implements ValueObject<String> {

    private String productCategory;

    public ProductCategory(String ProductName) {
        this.productCategory = Objects.requireNonNull(productCategory);
    }

    @Override
    public String value() {
        return this.productCategory;
    }

}
