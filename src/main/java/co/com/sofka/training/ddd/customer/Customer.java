package co.com.sofka.training.ddd.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.entity.CustomerBonus;
import co.com.sofka.training.ddd.customer.entity.CustomerFunction;
import co.com.sofka.training.ddd.customer.events.CustomerBonusAdded;
import co.com.sofka.training.ddd.customer.events.CustomerCreated;
import co.com.sofka.training.ddd.customer.events.CustomerFunctionAdded;
import co.com.sofka.training.ddd.customer.value.*;

import java.util.Objects;
import java.util.Set;

public class Customer extends AggregateEvent<CustomerId> {

    protected FullName fullName;
    protected PhoneNumber phoneNumber;
    protected Address address;
    protected Email email;
    protected MoneyQuantity moneyQuantity;

    protected CustomerBonus customerBonus;
    protected Set<CustomerFunction> employeeFunctionSet;

    public Customer(CustomerId customerId, FullName fullName, PhoneNumber phoneNumber,
                    Address address, Email email, MoneyQuantity moneyQuantity) {
        super(customerId);
        appendChange(new CustomerCreated(fullName, phoneNumber, address, email, moneyQuantity)).apply();
    }

    public void addCustomerFunction(CustomerFunctionId customerFunctionId, FunctionDescription functionDescription,
                    FunctionCharacteristic functionCharacteristic){
        Objects.requireNonNull(customerFunctionId);
        Objects.requireNonNull(functionDescription);
        Objects.requireNonNull(functionCharacteristic);
        appendChange(new CustomerFunctionAdded(customerFunctionId, functionDescription, functionCharacteristic)).apply();
    }

    public void addCustomerBonus(CustomerBonusId customerBonusId, DateBegin dateBegin,
                                    DateEnd dateEnd, DiscountPercent discountPercent){
        Objects.requireNonNull(customerBonusId);
        Objects.requireNonNull(dateBegin);
        Objects.requireNonNull(dateEnd);
        Objects.requireNonNull(discountPercent);
        appendChange(new CustomerBonusAdded(customerBonusId, dateBegin, dateEnd ,discountPercent)).apply();
    }

    public void changeFullName(FullName fullName){
        Objects.requireNonNull(fullName);
        appendChange(new CustomerFullNameUpdated(fullName)).apply();
    }






}
