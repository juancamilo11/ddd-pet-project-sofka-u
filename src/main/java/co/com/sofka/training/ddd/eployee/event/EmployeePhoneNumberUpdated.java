package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.PhoneNumber;

public class EmployeePhoneNumberUpdated extends DomainEvent {

    private final PhoneNumber phoneNumber;

    public EmployeePhoneNumberUpdated(PhoneNumber phoneNumber) {
        super("sofka.employee.employeephonenumberupdated");
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

}
