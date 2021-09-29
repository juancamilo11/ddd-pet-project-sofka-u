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

    private FullName fullName;
    private PhoneNumber phoneNumber;
    private Address address;
    private Email email;
    private MoneyQuantity moneyQuantity;
    private CustomerBonus customerBonus;
    private Set<CustomerFunction> customerFunctionSet;

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

    public void updateFullName(FullName fullName){
        Objects.requireNonNull(fullName);
        appendChange(new CustomerFullNameUpdated(fullName)).apply();
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber){
        Objects.requireNonNull(phoneNumber);
        appendChange(new CustomerPhoneNumberUpdated(phoneNumber)).apply();
    }

    public void updateAddress(Address address){
        Objects.requireNonNull(address);
        appendChange(new CustomerAddressUpdated(address)).apply();
    }

    public void updateEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new CustomerEmailUpdated(email)).apply();
    }

    public void updateMoneyQuantity(MoneyQuantity moneyQuantity){
        Objects.requireNonNull(moneyQuantity);
        appendChange(new CustomerMoneyQuantityUpdated(moneyQuantity)).apply();
    }

    public Optional<CustomerFunction> getCustomerFunctionById(CustomerFunctionId customerFunctionId){
        return this.customerFunctionSet
                .stream()
                .filter(function -> function.identity().equals(customerFunctionId))
                .findFirst();
    }

    public void updateFunctionDescription(FunctionDescription functionDescription){
        Objects.requireNonNull(functionDescription);
        appendChange(new CustomerFunctionDescriptionUpdated(functionDescription)).apply();
    }

    public void updateFunctionCharacteristic(FunctionCharacteristic functionCharacteristic){
        Objects.requireNonNull(functionCharacteristic);
        appendChange(new CustomerFunctionCharacteristicUpdated(functionCharacteristic)).apply();
    }

    public void updateBonusDateBegin(DateBegin dateBegin){
        Objects.requireNonNull(dateBegin);
        appendChange(new CustomerBonusDateBeginUpdated(dateBegin)).apply();
    }

    public void updateBonusDateEnd(DateEnd dateEnd){
        Objects.requireNonNull(dateEnd);
        appendChange(new CustomerBonusDateEndUpdated(dateEnd)).apply();
    }

    public void updateBonusPercentDiscount(DiscountPercent discountPercent){
        Objects.requireNonNull(discountPercent);
        appendChange(new CustomerBonusDiscountPercentUpdated(discountPercent)).apply();
    }



}
