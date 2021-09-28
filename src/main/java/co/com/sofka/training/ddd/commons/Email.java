package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

public class Email implements ValueObject<String> {

    private final String email;

    public Email(String value){
        this.email = value;
    }

    @Override
    public String value() {
        return this.email;
    }
}
