package co.com.sofka.training.ddd.store.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;

public class EmployeeRemoved extends DomainEvent {

    private final EmployeeId employeeId;


    public EmployeeRemoved(EmployeeId employeeId) {
        super("sofka.store.employeeremoved");
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

}
