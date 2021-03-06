package co.com.sofka.training.ddd.eployee.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class EmployeeFunction extends Entity<EmployeeFunctionId> {

    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;

    public EmployeeFunction(EmployeeFunctionId EmployeeFunctionId) {
        super(EmployeeFunctionId);
    }

    public FunctionDescription functionDescription() {
        return this.functionDescription;
    }

    public void updateFunctionDescription(FunctionDescription functionDescription) {
        this.functionDescription = functionDescription;
    }

    public FunctionCharacteristic functionCharacteristic() {
        return this.functionCharacteristic;
    }

    public void updateFunctionCharacteristic(FunctionCharacteristic functionCharacteristic) {
        this.functionCharacteristic = functionCharacteristic;
    }
}
