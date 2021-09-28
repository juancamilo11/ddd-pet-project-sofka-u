package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.ValueObject;

public class FunctionDescription implements ValueObject<String> {
    private String value;

    public FunctionDescription(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }

}
