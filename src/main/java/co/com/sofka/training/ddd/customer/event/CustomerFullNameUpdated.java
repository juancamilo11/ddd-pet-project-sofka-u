package co.com.sofka.training.ddd.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;

public class CustomerFullNameUpdated extends DomainEvent {

    private final FullName fullName;

    public CustomerFullNameUpdated(FullName fullName) {
        super("sofka.customer.customerfullnameupdated");
        this.fullName = fullName;
    }

    public FullName getFullName() {
        return this.fullName;
    }
}
