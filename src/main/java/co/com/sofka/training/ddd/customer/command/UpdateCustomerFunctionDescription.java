package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class UpdateCustomerFunctionDescription implements Command {

    private CustomerFunctionId customerFunctionId;
    private FunctionDescription functionDescription;

    public UpdateCustomerFunctionDescription(CustomerFunctionId customerFunctionId, FunctionDescription functionDescription) {
        this.customerFunctionId = customerFunctionId;
        this.functionDescription = functionDescription;
    }

    public CustomerFunctionId getCustomerFunctionId() {
        return customerFunctionId;
    }

    public void setCustomerFunctionId(CustomerFunctionId customerFunctionId) {
        this.customerFunctionId = customerFunctionId;
    }

    public FunctionDescription getFunctionDescription() {
        return functionDescription;
    }

    public void setFunctionDescription(FunctionDescription functionDescription) {
        this.functionDescription = functionDescription;
    }
}
