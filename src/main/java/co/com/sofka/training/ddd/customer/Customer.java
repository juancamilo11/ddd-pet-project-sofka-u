package co.com.sofka.training.ddd.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.entity.CustomerBonus;
import co.com.sofka.training.ddd.customer.entity.CustomerFunction;
import co.com.sofka.training.ddd.customer.events.*;
import co.com.sofka.training.ddd.customer.value.*;

import java.util.Objects;
import java.util.Optional;
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

    public void changePhoneNumber(PhoneNumber phoneNumber){
        Objects.requireNonNull(phoneNumber);
        appendChange(new CustomerPhoneNumberUpdated(phoneNumber)).apply();
    }

    public void changeAddress(Address address){
        Objects.requireNonNull(address);
        appendChange(new CustomerAddressUpdated(address)).apply();
    }

    public void changeEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new CustomerEmailUpdated(email)).apply();
    }

    public void changeMoneyQuantity(MoneyQuantity moneyQuantity){
        Objects.requireNonNull(moneyQuantity);
        appendChange(new CustomerMoneyQuantityUpdated(moneyQuantity)).apply();
    }

    public Optional<CustomerFunction> getFunctionById(CustomerFunctionId customerFunctionId){
        return this.employeeFunctionSet
                .stream()
                .filter(function -> function.identity().equals(customerFunctionId))
                .findFirst();
    }


}
