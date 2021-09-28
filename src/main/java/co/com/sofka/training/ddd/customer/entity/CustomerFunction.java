package co.com.sofka.training.ddd.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.customer.values.FunctionCharacteristic;
import co.com.sofka.training.ddd.customer.values.CustomerFunctionId;
import co.com.sofka.training.ddd.customer.values.FunctionDescription;

public class CustomerFunction extends Entity<CustomerFunctionId> {

    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;

    public CustomerFunction(CustomerFunctionId entityId, FunctionDescription functionDescription, FunctionCharacteristic functionCharacteristic) {
        super(entityId);
        this.functionDescription = functionDescription;
        this.functionCharacteristic = functionCharacteristic;
    }


}
