package co.com.sofka.training.ddd.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

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
