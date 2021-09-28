package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PhoneNumber implements ValueObject<String> {

    private final String phoneNumber;
    private final String prefix;

    public PhoneNumber(String phoneNumber, String prefix) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
        this.prefix = Objects.requireNonNull(prefix);
    }

    @Override
    public String value() {
        return this.prefix + " " + this.phoneNumber;
    }
}
