package co.com.sofka.training.ddd.eployee.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;
import co.com.sofka.training.ddd.eployee.value.EmployeeFunctionId;

public class EmployeeFunction extends Entity<EmployeeFunctionId> {
    public EmployeeFunction(EmployeeFunctionId entityId) {
        super(entityId);
    }
}
