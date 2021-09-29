package co.com.sofka.training.ddd.store.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.store.values.StoreName;

public class StoreCreated extends DomainEvent {

    private final StoreName storeName;
    private final PhoneNumber phoneNumber;
    private final Address address;
    private final Email email;
    private final MoneyQuantity moneyQuantity;

    public StoreCreated(StoreName storeName, PhoneNumber phoneNumber, Address address,
                           Email email, MoneyQuantity moneyQuantity) {
        super("sofka.store.storecreated");
        this.storeName = storeName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.moneyQuantity = moneyQuantity;
    }

    public StoreName getStoreName() {
        return this.storeName;
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
