package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.*;

public class EmploymentContractAdded extends DomainEvent {

    private final EmploymentContractId employmentContractId;
    private final Salary salary;
    private final JobPosition jobPosition;
    private final WorkingTime workingTime;
    private final ContractTerm contractTerm;

    public EmploymentContractAdded(EmploymentContractId employmentContractId, JobPosition jobPosition, WorkingTime workingTime, Salary salary, ContractTerm contractTerm) {
        super("sofka.employee.employmentcontractadded");
        this.employmentContractId = employmentContractId;
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.workingTime = workingTime;
        this.contractTerm = contractTerm;
    }

    public EmploymentContractId getEmploymentContractId() {
        return this.employmentContractId;
    }

    public Salary getSalary() {
        return this.salary;
    }

    public JobPosition getJobPosition() {
        return this.jobPosition;
    }

    public WorkingTime getWorkingTime() {
        return this.workingTime;
    }

    public ContractTerm getContractTerm() {
        return this.contractTerm;
    }
}
