package co.com.sofka.training.ddd.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.PhoneNumber;

public class CustomerPhoneNumberUpdated extends DomainEvent {
    private final PhoneNumber phoneNumber;

    public CustomerPhoneNumberUpdated(PhoneNumber phoneNumber) {
        super("sofka.customer.customerphonenumberupdated");
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }
}
