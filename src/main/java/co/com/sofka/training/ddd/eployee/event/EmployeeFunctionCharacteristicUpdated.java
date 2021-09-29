package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class EmployeeFunctionCharacteristicUpdated extends DomainEvent {

    private final EmployeeFunctionId employeeFunctionId;
    private final FunctionCharacteristic functionCharacteristic;

    public EmployeeFunctionCharacteristicUpdated(EmployeeFunctionId employeeFunctionId, FunctionCharacteristic functionCharacteristic){
        super("sofka.employee.employeefunctioncharacteristicupdated");
        this.employeeFunctionId = employeeFunctionId;
        this.functionCharacteristic = functionCharacteristic;
    }

    public EmployeeFunctionId getEmployeeFunctionId() {
        return this.employeeFunctionId;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return this.functionCharacteristic;
    }
}