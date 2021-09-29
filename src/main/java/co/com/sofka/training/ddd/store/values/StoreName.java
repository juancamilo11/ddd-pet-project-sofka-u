package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StoreName implements ValueObject<String> {

    private String storeName;

    public StoreName(String storeName) {
        this.storeName = Objects.requireNonNull(storeName);
    }

    @Override
    public String value() {
        return this.storeName;
    }
}
