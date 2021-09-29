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

    public Salary salary() {
        return this.salary;
    }

    public void updateSalary(Salary salary) {
        this.salary = salary;
    }

    public JobPosition jobPosition() {
        return this.jobPosition;
    }

    public void updateJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public WorkingTime workingTime() {
        return workingTime;
    }

    public void updateWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }

    public ContractTerm contractTerm() {
        return contractTerm;
    }

    public void updateContractTerm(ContractTerm contractTerm) {
        this.contractTerm = contractTerm;
    }
}
