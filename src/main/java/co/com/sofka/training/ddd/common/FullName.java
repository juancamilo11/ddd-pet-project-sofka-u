package co.com.sofka.training.ddd.common;

import co.com.sofka.domain.generic.ValueObject;

public class FullName implements ValueObject<String> {

    private final String firstName;
    private final String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String value() {
        return this.firstName + " " + this.lastName;
    }
}
