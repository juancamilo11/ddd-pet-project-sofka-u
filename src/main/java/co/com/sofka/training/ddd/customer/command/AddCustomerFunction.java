package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.commons.FunctionDescription;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class AddCustomerFunction implements Command {

    private CustomerFunctionId customerFunctionId;
    private FunctionDescription functionDescription;
    private FunctionCharacteristic functionCharacteristic;

    public AddCustomerFunction(CustomerFunctionId customerFunctionId, FunctionDescription functionDescription, FunctionCharacteristic functionCharacteristic) {
        this.customerFunctionId = customerFunctionId;
        this.functionDescription = functionDescription;
        this.functionCharacteristic = functionCharacteristic;
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

    public FunctionCharacteristic getFunctionCharacteristic() {
        return functionCharacteristic;
    }

    public void setFunctionCharacteristic(FunctionCharacteristic functionCharacteristic) {
        this.functionCharacteristic = functionCharacteristic;
    }
}
