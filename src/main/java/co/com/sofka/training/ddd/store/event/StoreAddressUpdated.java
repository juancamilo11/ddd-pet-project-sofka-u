package co.com.sofka.training.ddd.store.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Address;

public class StoreAddressUpdated extends DomainEvent {

    private final Address address;

    public StoreAddressUpdated(Address address) {
        super("sofka.store.storeaddressupdated");
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

}
