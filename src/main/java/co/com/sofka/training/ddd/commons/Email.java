package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String email;

    public Email(String value){
        this.email = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return this.email;
    }
}
