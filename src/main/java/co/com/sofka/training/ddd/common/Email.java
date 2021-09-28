package co.com.sofka.training.ddd.common;

import co.com.sofka.domain.generic.ValueObject;

public class Email implements ValueObject<String> {

    private final String value;

    public Email(String value){
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
