package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class EmployeeFunctionDescriptionUpdated extends DomainEvent {

    private EmployeeFunctionId employeeFunctionId;
    private FunctionDescription functionDescription;

    public EmployeeFunctionDescriptionUpdated(EmployeeFunctionId employeeFunctionId, FunctionDescription functionDescription) {
        super("sofka.employee.employeefunctiondescriptionupdated");
        this.employeeFunctionId = employeeFunctionId;
        this.functionDescription = functionDescription;
    }

    public EmployeeFunctionId getEmployeeFunctionId() {
        return this.employeeFunctionId;
    }

    public FunctionDescription getFunctionDescription() {
        return this.functionDescription;
    }

}
