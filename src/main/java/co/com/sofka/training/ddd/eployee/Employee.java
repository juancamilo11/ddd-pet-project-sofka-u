package co.com.sofka.training.ddd.eployee;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.eployee.entity.EmployeeFunction;
import co.com.sofka.training.ddd.eployee.entity.EmploymentContract;
import co.com.sofka.training.ddd.eployee.events.*;
import co.com.sofka.training.ddd.eployee.value.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Employee extends AggregateEvent<EmployeeId> {

    protected FullName fullName;
    protected PhoneNumber phoneNumber;
    protected Address address;
    protected Email email;
    protected EmploymentContract employmentContract;
    protected Set<EmployeeFunction> employeeFunctionSet;

    public Employee(EmployeeId employeeId, FullName fullName, PhoneNumber phoneNumber,
                    Address address, Email email, EmploymentContractId employmentContractId,
                    Salary salary, JobPosition jobPosition,
                    WorkingTime workingTime, ContractTerm contractTerm) {
        super(employeeId);
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.employmentContract = new EmploymentContract(employmentContractId,jobPosition,workingTime,salary,contractTerm);
        appendChange(new EmployeeCreated(fullName, phoneNumber, address, email)).apply();
    }

    public Employee(EmployeeId employeeId){
        super(employeeId);
        subscribe(new EmployeeChange(this));
    }

    public void addEmployeeFunction(EmployeeFunctionId employeeFunctionId, FunctionDescription functionDescription,
                                    FunctionCharacteristic functionCharacteristic){
        Objects.requireNonNull(employeeFunctionId);
        Objects.requireNonNull(functionDescription);
        Objects.requireNonNull(functionCharacteristic);
        appendChange(new EmployeeFunctionAdded(employeeFunctionId, functionDescription, functionCharacteristic)).apply();
    }

    public void addEmploymentContract(EmploymentContractId employmentContractId, Salary salary, JobPosition jobPosition,
                                      WorkingTime workingTime,ContractTerm contractTerm){
        Objects.requireNonNull(salary);
        Objects.requireNonNull(jobPosition);
        Objects.requireNonNull(workingTime);
        Objects.requireNonNull(employmentContractId);
        appendChange(new EmploymentContractAdded(employmentContractId, jobPosition, workingTime, salary, contractTerm)).apply();
    }

    public Optional<EmployeeFunction> getEmployeeFunctionById(EmployeeFunctionId employeeFunctionId){
        return this.employeeFunctionSet
                .stream()
                .filter(function -> function.identity().equals(employeeFunctionId))
                .findFirst();
    }

    public void changeFullName(FullName fullName){
        Objects.requireNonNull(fullName);
        appendChange(new EmployeeFullNameUpdated(fullName)).apply();
    }

    public void changePhoneNumber(PhoneNumber phoneNumber){
        Objects.requireNonNull(phoneNumber);
        appendChange(new EmployeePhoneNumberUpdated(phoneNumber)).apply();
    }

    public void changeAddress(Address address){
        Objects.requireNonNull(address);
        appendChange(new EmployeeAddressUpdated(address)).apply();
    }

    public void changeEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new EmployeeEmailUpdated(email)).apply();
    }

    public void updateEmployeeFunctionDescription(EmployeeFunctionId employeeFunctionId, FunctionDescription functionDescription){
        Objects.requireNonNull(employeeFunctionId);
        Objects.requireNonNull(functionDescription);
        appendChange(new EmployeeFunctionDescriptionUpdated(employeeFunctionId, functionDescription)).apply();
    }

    public void updateEmployeeFunctionCharacteristic(EmployeeFunctionId employeeFunctionId,FunctionCharacteristic functionCharacteristic){
        Objects.requireNonNull(employeeFunctionId);
        Objects.requireNonNull(functionCharacteristic);
        appendChange(new EmployeeFunctionCharacteristicUpdated(employeeFunctionId, functionCharacteristic)).apply();
    }

    public void updateJobPosition(JobPosition jobPosition){
        Objects.requireNonNull(jobPosition);
        appendChange(new EmployeeJobPositionUpdated(jobPosition)).apply();
    }

    public void updateWorkingTime(WorkingTime workingTime){
        Objects.requireNonNull(workingTime);
        appendChange(new EmployeeWorkingTimeUpdated(workingTime)).apply();
    }

    public void updateSalary(Salary salary){
        Objects.requireNonNull(salary);
        appendChange(new EmployeeSalaryUpdated(salary)).apply();
    }

    public void updateContractTerm(ContractTerm contractTerm){
        Objects.requireNonNull(contractTerm);
        appendChange(new EmployeeContractTermUpdated(contractTerm)).apply();
    }

}
