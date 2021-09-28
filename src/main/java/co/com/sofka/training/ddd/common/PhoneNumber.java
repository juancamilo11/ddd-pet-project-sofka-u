package co.com.sofka.training.ddd.common;

import co.com.sofka.domain.generic.ValueObject;

public class PhoneNumber implements ValueObject<String> {

    private final String phoneNumber;
    private final String prefix;

    public PhoneNumber(String phoneNumber, String prefix) {
        this.phoneNumber = phoneNumber;
        this.prefix = prefix;
    }

    @Override
    public String value() {
        return this.prefix + " " + this.phoneNumber;
    }
}
