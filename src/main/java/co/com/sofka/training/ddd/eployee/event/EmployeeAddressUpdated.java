package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Address;

public class EmployeeAddressUpdated extends DomainEvent {

    private final Address address;

    public EmployeeAddressUpdated(Address address) {
        super("sofka.employee.employeeaddressupdated");
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

}
