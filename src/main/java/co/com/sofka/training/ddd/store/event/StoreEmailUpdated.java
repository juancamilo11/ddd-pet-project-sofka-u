package co.com.sofka.training.ddd.store.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Email;

public class StoreEmailUpdated extends DomainEvent {

    private final Email email;

    public StoreEmailUpdated(Email email) {
        super("sofka.store.storeemailupdated");
        this.email = email;
    }

    public Email getEmail() {
        return this.email;
    }
}
