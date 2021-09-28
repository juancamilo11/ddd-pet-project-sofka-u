package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.FullName;

public class EmployeeFullNameUpdated extends DomainEvent {

    private final FullName fullName;

    public EmployeeFullNameUpdated(FullName fullName) {
        super("sofka.employee.employeefullnameupdated");
        this.fullName = fullName;
    }

    public FullName getFullName() {
        return this.fullName;
    }

}
