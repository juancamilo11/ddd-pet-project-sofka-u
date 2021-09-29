package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class UpdateEmployeeFunctionDescription implements Command {

    private EmployeeFunctionId employeeFunctionId;
    private FunctionDescription functionDescription;

    public UpdateEmployeeFunctionDescription(EmployeeFunctionId employeeFunctionId, FunctionDescription functionDescription) {
        this.employeeFunctionId = employeeFunctionId;
        this.functionDescription = functionDescription;
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
}
