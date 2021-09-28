package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Iva implements ValueObject<Double> {

    private Double iva;

    public Iva(Double iva){
        this.iva = Objects.requireNonNull(iva);
    }

    @Override
    public Double value() {
        return this.iva;
    }
}
