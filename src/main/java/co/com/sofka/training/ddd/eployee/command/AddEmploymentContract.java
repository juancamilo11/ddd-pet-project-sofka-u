package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.*;

public class AddEmploymentContract implements Command {

    private EmploymentContractId employmentContractId;
    private Salary salary;
    private JobPosition jobPosition;
    private WorkingTime workingTime;
    private ContractTerm contractTerm;

    public AddEmploymentContract(EmploymentContractId employmentContractId, Salary salary, JobPosition jobPosition, WorkingTime workingTime, ContractTerm contractTerm) {
        this.employmentContractId = employmentContractId;
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.workingTime = workingTime;
        this.contractTerm = contractTerm;
    }

    public EmploymentContractId getEmploymentContractId() {
        return employmentContractId;
    }

    public void setEmploymentContractId(EmploymentContractId employmentContractId) {
        this.employmentContractId = employmentContractId;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public WorkingTime getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }

    public ContractTerm getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(ContractTerm contractTerm) {
        this.contractTerm = contractTerm;
    }
}
