package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.ValueObject;

public class FunctionCharacteristic implements ValueObject<String> {

    private String value;

    public FunctionCharacteristic(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
