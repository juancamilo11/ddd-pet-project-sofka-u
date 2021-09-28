package co.com.sofka.training.ddd.eployee;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.eployee.entity.EmployeeFunction;
import co.com.sofka.training.ddd.eployee.entity.EmploymentContract;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;

import java.util.Set;

public class Employee extends AggregateEvent<EmployeeId> {

    private FullName fullName;
    private PhoneNumber phoneNumber;
    private Address address;
    private Email email;

    private EmploymentContract employmentContract;
    private Set<EmployeeFunction> employeeFunctionSet;

    public Employee(EmployeeId employeeId) {
        super(employeeId);

    }
}
