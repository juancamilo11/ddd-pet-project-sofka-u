package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

public class ProductCategory implements ValueObject<String> {

    private String productCategory;

    public ProductCategory(String ProductName) {
        this.productCategory = productCategory;
    }

    @Override
    public String value() {
        return this.productCategory;
    }

}
