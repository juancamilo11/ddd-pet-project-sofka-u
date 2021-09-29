package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class UpdateEmployeeFunctionCharacteristic implements Command {

    private EmployeeFunctionId employeeFunctionId;
    private FunctionCharacteristic functionCharacteristic;

    public UpdateEmployeeFunctionCharacteristic(EmployeeFunctionId employeeFunctionId, FunctionCharacteristic functionCharacteristic) {
        this.employeeFunctionId = employeeFunctionId;
        this.functionCharacteristic = functionCharacteristic;
    }

    public EmployeeFunctionId getEmployeeFunctionId() {
        return employeeFunctionId;
    }

    public void setEmployeeFunctionId(EmployeeFunctionId employeeFunctionId) {
        this.employeeFunctionId = employeeFunctionId;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return functionCharacteristic;
    }

    public void setFunctionCharacteristic(FunctionCharacteristic functionCharacteristic) {
        this.functionCharacteristic = functionCharacteristic;
    }
}
