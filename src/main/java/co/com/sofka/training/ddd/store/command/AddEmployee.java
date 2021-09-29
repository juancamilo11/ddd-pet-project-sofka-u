package co.com.sofka.training.ddd.store.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;

public class AddEmployee implements Command {

    private EmployeeId employeeId;

    public AddEmployee(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}
