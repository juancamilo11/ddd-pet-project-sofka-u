package co.com.sofka.training.ddd.eployee.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.DiscountPercent;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;
import co.com.sofka.training.ddd.eployee.value.*;

public class EmploymentContractAdded extends DomainEvent {

    private Salary salary;
    private JobPosition jobPosition;
    private WorkingTime workingTime;
    private ContractTerm contractTerm;

    public EmploymentContractAdded(EmploymentContractId employmentContractId, Salary salary, JobPosition jobPosition, WorkingTime workingTime, ContractTerm contractTerm) {
        super("sofka.employee.employmentcontractadded");
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.workingTime = workingTime;
        this.contractTerm = contractTerm;
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
