package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;

public class EmployeeFunctionCharacteristicUpdated extends DomainEvent {

    private FunctionCharacteristic functionCharacteristic;

    public EmployeeFunctionCharacteristicUpdated(FunctionCharacteristic functionCharacteristic){
        super("sofka.employee.employeefunctioncharacteristicupdated");
        this.functionCharacteristic = functionCharacteristic;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return this.functionCharacteristic;
    }
}