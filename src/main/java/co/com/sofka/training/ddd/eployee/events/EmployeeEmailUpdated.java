package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Email;

public class EmployeeEmailUpdated extends DomainEvent {

    private final Email email;

    public EmployeeEmailUpdated(Email email) {
        super("sofka.employee.employeeemailupdated");
        this.email = email;
    }

    public Email getEmail() {
        return this.email;
    }
}
