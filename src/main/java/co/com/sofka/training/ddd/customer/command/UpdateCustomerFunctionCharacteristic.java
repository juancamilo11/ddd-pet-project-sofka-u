package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FunctionCharacteristic;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class UpdateCustomerFunctionCharacteristic implements Command {

    private CustomerFunctionId customerFunctionId;
    private FunctionCharacteristic functionCharacteristic;

    public UpdateCustomerFunctionCharacteristic(CustomerFunctionId customerFunctionId, FunctionCharacteristic functionCharacteristic) {
        this.customerFunctionId = customerFunctionId;
        this.functionCharacteristic = functionCharacteristic;
    }

    public CustomerFunctionId getCustomerFunctionId() {
        return customerFunctionId;
    }

    public void setCustomerFunctionId(CustomerFunctionId customerFunctionId) {
        this.customerFunctionId = customerFunctionId;
    }

    public FunctionCharacteristic getFunctionCharacteristic() {
        return functionCharacteristic;
    }

    public void setFunctionCharacteristic(FunctionCharacteristic functionCharacteristic) {
        this.functionCharacteristic = functionCharacteristic;
    }
}
