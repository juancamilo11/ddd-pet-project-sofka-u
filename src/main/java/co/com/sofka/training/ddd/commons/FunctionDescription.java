package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

public class FunctionDescription implements ValueObject<String> {
    private String FunctDescription;

    public FunctionDescription(String FunctDescription) {
        this.FunctDescription = FunctDescription;
    }

    @Override
    public String value() {
        return this.FunctDescription;
    }

}
