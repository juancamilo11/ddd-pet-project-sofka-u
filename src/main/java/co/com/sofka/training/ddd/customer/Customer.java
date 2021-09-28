package co.com.sofka.training.ddd.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.entity.CustomerBonus;
import co.com.sofka.training.ddd.customer.entity.CustomerFunction;
import co.com.sofka.training.ddd.customer.value.*;

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
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.moneyQuantity = moneyQuantity;
    }
}
