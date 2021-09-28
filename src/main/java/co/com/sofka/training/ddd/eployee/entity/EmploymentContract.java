package co.com.sofka.training.ddd.eployee.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.eployee.value.*;

public class EmploymentContract extends Entity<EmploymentContractId> {
    private Salary salary;
    private JobPosition jobPosition;
    private WorkingTime workingTime;
    private ContractTerm contractTerm;

    public EmploymentContract(EmploymentContractId employmentContractId, JobPosition jobPosition,
                              WorkingTime workingTime, Salary salary,ContractTerm contractTerm) {
        super(employmentContractId);
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.workingTime = workingTime;
        this.contractTerm = contractTerm;
    }
}
