package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.WorkingTime;

public class EmployeeWorkingTimeUpdated  extends DomainEvent {

    private final WorkingTime workingTime;

    public EmployeeWorkingTimeUpdated(WorkingTime workingTime) {
        super("sofka.employee.employeeworkingtimeupdated");
        this.workingTime = workingTime;
    }

    public WorkingTime getWorkingTime() {
        return this.workingTime;
    }
}
