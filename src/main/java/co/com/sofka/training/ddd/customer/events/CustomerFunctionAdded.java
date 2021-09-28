package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class CustomerFunctionAdded extends DomainEvent {

    private final CustomerFunctionId customerFunctionId;
    private final FunctionDescription functionDescription;
    private final FunctionCharacteristic functionCharacteristic;

    public CustomerFunctionAdded(CustomerFunctionId customerFunctionId, FunctionDescription functionDescription,
                                 FunctionCharacteristic functionCharacteristic) {
        super("sofka.customer.customerfunctionadded");
        this.customerFunctionId = customerFunctionId;
        this.functionDescription = functionDescription;
        this.functionCharacteristic = functionCharacteristic;
    }

    public CustomerFunctionId getCustomerFunctionId() {
        return this.customerFunctionId;
    }

    public FunctionDescription getFunctionDescription() {
        return this.functionDescription;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return this.functionCharacteristic;
    }
}
