package co.com.sofka.training.ddd.eployee;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.events.CustomerBonusAdded;
import co.com.sofka.training.ddd.customer.events.CustomerCreated;
import co.com.sofka.training.ddd.customer.events.CustomerFunctionAdded;
import co.com.sofka.training.ddd.customer.value.*;
import co.com.sofka.training.ddd.eployee.entity.EmployeeFunction;
import co.com.sofka.training.ddd.eployee.entity.EmploymentContract;
import co.com.sofka.training.ddd.eployee.events.EmployeeCreated;
import co.com.sofka.training.ddd.eployee.events.EmployeeFunctionAdded;
import co.com.sofka.training.ddd.eployee.events.EmploymentContractAdded;
import co.com.sofka.training.ddd.eployee.value.*;

import java.util.Objects;
import java.util.Set;

public class Employee extends AggregateEvent<EmployeeId> {

    private FullName fullName;
    private PhoneNumber phoneNumber;
    private Address address;
    private Email email;

    private EmploymentContract employmentContract;
    private Set<EmployeeFunction> employeeFunctionSet;

    public Employee(EmployeeId employeeId, FullName fullName, PhoneNumber phoneNumber,
                    Address address, Email email) {
        super(employeeId);
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        appendChange(new EmployeeCreated(fullName, phoneNumber, address, email)).apply();
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
        appendChange(new EmploymentContractAdded(employmentContractId, salary,jobPosition, workingTime, contractTerm)).apply();
    }









}
