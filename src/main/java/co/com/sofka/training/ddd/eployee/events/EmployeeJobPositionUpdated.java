package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.JobPosition;

public class EmployeeJobPositionUpdated  extends DomainEvent {

    private final JobPosition jobPosition;

    public EmployeeJobPositionUpdated(JobPosition jobPosition) {
        super("sofka.employee.employeejobpositionupdated");
        this.jobPosition = jobPosition;
    }

    public JobPosition getJobPosition() {
        return this.jobPosition;
    }
}
