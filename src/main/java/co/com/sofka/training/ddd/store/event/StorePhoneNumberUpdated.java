package co.com.sofka.training.ddd.store.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.PhoneNumber;

public class StorePhoneNumberUpdated extends DomainEvent {
    private final PhoneNumber phoneNumber;

    public StorePhoneNumberUpdated(PhoneNumber phoneNumber) {
        super("sofka.store.storephonenumberupdated");
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

}
