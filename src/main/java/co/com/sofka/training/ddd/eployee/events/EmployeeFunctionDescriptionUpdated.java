package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionDescription;

public class EmployeeFunctionDescriptionUpdated extends DomainEvent {

    private FunctionDescription functionDescription;

    public EmployeeFunctionDescriptionUpdated(FunctionDescription functionDescription) {
        super("sofka.employee.employeefunctiondescriptionupdated");
        this.functionDescription = functionDescription;
    }

    public FunctionDescription getFunctionDescription() {
        return this.functionDescription;
    }

}
