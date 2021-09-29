package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class CustomerFunctionDescriptionUpdated extends DomainEvent {

    private final CustomerFunctionId customerFunctionId;
    private FunctionDescription functionDescription;

    public CustomerFunctionDescriptionUpdated(CustomerFunctionId customerFunctionId, FunctionDescription functionDescription) {
        super("sofka.customer.customerfunctiondescriptionupdated");
        this.customerFunctionId = customerFunctionId;
        this.functionDescription = functionDescription;
    }

    public CustomerFunctionId getCustomerFunctionId() {
        return this.customerFunctionId;
    }

    public FunctionDescription getFunctionDescription() {
        return this.functionDescription;
    }

}
