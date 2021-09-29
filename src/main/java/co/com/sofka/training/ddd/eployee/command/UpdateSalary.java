package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.Salary;

public class UpdateSalary implements Command {

    private Salary salary;

    public UpdateSalary(Salary salary) {
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
