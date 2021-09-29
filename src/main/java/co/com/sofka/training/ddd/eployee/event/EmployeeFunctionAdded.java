package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class EmployeeFunctionAdded extends DomainEvent {
    private final EmployeeFunctionId employeeFunctionId;
    private final FunctionDescription functionDescription;
    private final FunctionCharacteristic functionCharacteristic;

    public EmployeeFunctionAdded(EmployeeFunctionId employeeFunctionId, FunctionDescription functionDescription,
                                 FunctionCharacteristic functionCharacteristic) {
        super("sofka.employee.employeefunctionadded");
        this.employeeFunctionId = employeeFunctionId;
        this.functionDescription = functionDescription;
        this.functionCharacteristic = functionCharacteristic;
    }

    public EmployeeFunctionId getCustomerFunctionId() {
        return this.employeeFunctionId;
    }

    public FunctionDescription getFunctionDescription() {
        return this.functionDescription;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return this.functionCharacteristic;
    }
}
