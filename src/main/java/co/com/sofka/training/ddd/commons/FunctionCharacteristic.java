package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FunctionCharacteristic implements ValueObject<String> {

    private String functCharacteristic;

    public FunctionCharacteristic(String functCharacteristic) {
        this.functCharacteristic = Objects.requireNonNull(functCharacteristic);
    }

    @Override
    public String value() {
        return this.functCharacteristic;
    }
}
