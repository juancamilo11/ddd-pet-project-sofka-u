package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<String> {

    private final String addressInfo;
    private final String aditionalInfo;

    public Address(String addressInfo , String aditionalInfo){
        this.addressInfo = Objects.requireNonNull(addressInfo);
        this.aditionalInfo = Objects.requireNonNull(aditionalInfo);
    }

    @Override
    public String value() {
        return this.addressInfo + " " + this.aditionalInfo;
    }
}