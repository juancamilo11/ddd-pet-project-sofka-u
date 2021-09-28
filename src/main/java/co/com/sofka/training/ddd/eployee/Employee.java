package co.com.sofka.training.ddd.eployee;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.customer.value.CustomerId;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;

public class Employee extends AggregateEvent<EmployeeId> {

    

    public Employee(EmployeeId employeeId) {
        super(employeeId);

    }
}
