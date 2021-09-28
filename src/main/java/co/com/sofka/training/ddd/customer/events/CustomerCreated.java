package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;

import java.util.UUID;

public class CustomerCreated extends DomainEvent {

    protected final FullName fullName;
    protected final PhoneNumber phoneNumber;
    protected final Address address;
    protected final Email email;
    protected final MoneyQuantity moneyQuantity;

    public CustomerCreated(FullName fullName, PhoneNumber phoneNumber, Address address,
                           Email email, MoneyQuantity moneyQuantity) {
        super("sofka.customer.customercreated");
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.moneyQuantity = moneyQuantity;
    }

    public FullName getFullName() {
        return this.fullName;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public Address getAddress() {
        return this.address;
    }

    public Email getEmail() {
        return this.email;
    }

    public MoneyQuantity getMoneyQuantity() {
        return this.moneyQuantity;
    }
}
