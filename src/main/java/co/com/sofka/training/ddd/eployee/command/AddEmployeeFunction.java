package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class AddEmployeeFunction implements Command {

    private EmployeeFunctionId employeeFunctionId;
    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;


    public AddEmployeeFunction(EmployeeFunctionId employeeFunctionId, FunctionCharacteristic functionCharacteristic) {
        this.employeeFunctionId = employeeFunctionId;
        this.functionCharacteristic = functionCharacteristic;
    }

    public EmployeeFunctionId getEmployeeFunctionId() {
        return employeeFunctionId;
    }

    public void setEmployeeFunctionId(EmployeeFunctionId employeeFunctionId) {
        this.employeeFunctionId = employeeFunctionId;
    }

    public FunctionDescription getFunctionDescription() {
        return functionDescription;
    }

    public void setFunctionDescription(FunctionDescription functionDescription) {
        this.functionDescription = functionDescription;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return functionCharacteristic;
    }

    public void setFunctionCharacteristic(FunctionCharacteristic functionCharacteristic) {
        this.functionCharacteristic = functionCharacteristic;
    }
}
