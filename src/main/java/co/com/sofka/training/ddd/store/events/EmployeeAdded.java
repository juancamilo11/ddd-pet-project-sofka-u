package co.com.sofka.training.ddd.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;

public class EmployeeAdded extends DomainEvent {

    private final EmployeeId employeeId;

    public EmployeeAdded(EmployeeId employeeId) {
        super("sofka.store.employeeadded");
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }
}
