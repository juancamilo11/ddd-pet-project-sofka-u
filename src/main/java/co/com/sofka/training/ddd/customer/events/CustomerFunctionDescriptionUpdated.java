package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionDescription;

public class CustomerFunctionDescriptionUpdated extends DomainEvent {

    private FunctionDescription functionDescription;

    public CustomerFunctionDescriptionUpdated(FunctionDescription functionDescription) {
        super("sofka.customer.customerfunctiondescriptionupdated");
        this.functionDescription = functionDescription;
    }

    public FunctionDescription getFunctionDescription() {
        return this.functionDescription;
    }

}
