package co.com.sofka.training.ddd.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;

import java.util.Objects;

public class CustomerFunction extends Entity<CustomerFunctionId> {

    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;

    public CustomerFunction(CustomerFunctionId entityId, FunctionDescription functionDescription, FunctionCharacteristic functionCharacteristic) {
        super(entityId);
        this.functionDescription = functionDescription;
        this.functionCharacteristic = functionCharacteristic;
    }

    public void updateFunctionDescription(FunctionDescription functionDescription){
        this.functionDescription = Objects.requireNonNull(functionDescription);
    }

    public void updatefunctionCharacteristic(FunctionCharacteristic functionCharacteristic){
        this.functionCharacteristic = Objects.requireNonNull(functionCharacteristic);
    }

    public FunctionDescription functionDescription() {
        return this.functionDescription;
    }

    public FunctionCharacteristic functionCharacteristic() {
        return this.functionCharacteristic;
    }

}
