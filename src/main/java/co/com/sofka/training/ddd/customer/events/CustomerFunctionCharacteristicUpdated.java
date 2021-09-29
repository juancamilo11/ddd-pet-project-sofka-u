package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class CustomerFunctionCharacteristicUpdated extends DomainEvent {
    private final CustomerFunctionId customerFunctionId;
    private FunctionCharacteristic functionCharacteristic;

    public CustomerFunctionCharacteristicUpdated(CustomerFunctionId customerFunctionId, FunctionCharacteristic functionCharacteristic) {
        super("sofka.customer.customerfunctioncharacteristicupdated");
        this.customerFunctionId = customerFunctionId;
        this.functionCharacteristic = functionCharacteristic;
    }

    public CustomerFunctionId customerFunctionId() {
        return this.customerFunctionId;
    }

    public FunctionCharacteristic functionCharacteristic() {
        return this.functionCharacteristic;
    }
}
