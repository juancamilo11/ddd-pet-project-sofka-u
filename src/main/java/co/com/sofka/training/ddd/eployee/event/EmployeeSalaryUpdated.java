package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.Salary;

public class EmployeeSalaryUpdated extends DomainEvent {
    private final Salary salary;

    public EmployeeSalaryUpdated(Salary salary) {
        super("sofka.employee.employeesalaryupdated");
        this.salary = salary;
    }

    public Salary getSalary() {
        return this.salary;
    }
}
