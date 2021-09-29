package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;

public class EmployeeCreated extends DomainEvent {

    private final FullName fullName;
    private final PhoneNumber phoneNumber;
    private final Address address;
    private final Email email;

    public EmployeeCreated(FullName fullName, PhoneNumber phoneNumber, Address address,
                           Email email) {
        super("sofka.employee.employeecreated");
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public FullName getFullName() {
        return this.fullName;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public Address getAddress() {
        return this.address;
    }

    public Email getEmail() {
        return this.email;
    }


}
