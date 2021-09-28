package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Address;

public class CustomerAddressUpdated  extends DomainEvent {

    private final Address address;

    public CustomerAddressUpdated(Address address) {
        super("sofka.customer.customeraddressupdated");
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }
}
