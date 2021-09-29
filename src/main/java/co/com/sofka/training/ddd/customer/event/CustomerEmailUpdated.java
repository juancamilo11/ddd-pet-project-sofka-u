package co.com.sofka.training.ddd.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Email;

public class CustomerEmailUpdated extends DomainEvent {
    private final Email email;

    public CustomerEmailUpdated(Email email) {
        super("sofka.customer.customeremailupdated");
        this.email = email;
    }

    public Email getEmail() {
        return this.email;
    }
}
