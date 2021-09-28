package co.com.sofka.training.ddd.common;

import co.com.sofka.domain.generic.ValueObject;

public class Address implements ValueObject<String> {

    private final String addressInfo;
    private final String aditionalInfo;

    public Address(String addressInfo , String aditionalInfo){
        this.addressInfo = addressInfo;
        this.aditionalInfo = aditionalInfo;
    }

    @Override
    public String value() {
        return this.addressInfo + " " + this.aditionalInfo;
    }
}