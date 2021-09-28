package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FunctionDescription implements ValueObject<String> {
    private String functDescription;

    public FunctionDescription(String functDescription) {
        this.functDescription = Objects.requireNonNull(functDescription);
    }

    @Override
    public String value() {
        return this.functDescription;
    }

}
