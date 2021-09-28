package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;

public class CustomerFunctionCharacteristicUpdated extends DomainEvent {
    private FunctionCharacteristic functionCharacteristic;

    public CustomerFunctionCharacteristicUpdated(FunctionCharacteristic functionCharacteristic) {
        super("sofka.customer.customerfunctioncharacteristicupdated");
        this.functionCharacteristic = functionCharacteristic;
    }

    public FunctionCharacteristic functionCharacteristic() {
        return this.functionCharacteristic;
    }
}
