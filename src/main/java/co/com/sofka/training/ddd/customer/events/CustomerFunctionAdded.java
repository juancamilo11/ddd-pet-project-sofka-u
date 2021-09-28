package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class CustomerFunctionAdded extends DomainEvent {

    private CustomerFunctionId customerFunctionId;
    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;

    public CustomerFunctionAdded(CustomerFunctionId customerFunctionId, FunctionDescription functionDescription,
                                 FunctionCharacteristic functionCharacteristic) {
        super("sofka.customer.customerfunctionadded");
    }

}
