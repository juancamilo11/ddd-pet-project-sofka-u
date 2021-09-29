package co.com.sofka.training.ddd.eployee.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.eployee.value.ContractTerm;

public class EmployeeContractTermUpdated extends DomainEvent {
    private final ContractTerm contractTerm;

    public EmployeeContractTermUpdated(ContractTerm contractTerm) {
        super("sofka.employee.employeecontracttermupdated");
        this.contractTerm = contractTerm;
    }

    public ContractTerm getContractTerm() {
        return this.contractTerm;
    }

}
