package co.com.sofka.training.ddd.store.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;

public class RemoveEmployee implements Command {

    private EmployeeId employeeId;

    public RemoveEmployee(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}
