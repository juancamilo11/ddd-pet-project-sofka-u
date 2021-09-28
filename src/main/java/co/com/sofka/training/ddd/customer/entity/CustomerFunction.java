package co.com.sofka.training.ddd.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;
import co.com.sofka.training.ddd.commons.FunctionDescription;

public class CustomerFunction extends Entity<CustomerFunctionId> {

    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;

    public CustomerFunction(CustomerFunctionId entityId, FunctionDescription functionDescription, FunctionCharacteristic functionCharacteristic) {
        super(entityId);
        this.functionDescription = functionDescription;
        this.functionCharacteristic = functionCharacteristic;
    }




}
