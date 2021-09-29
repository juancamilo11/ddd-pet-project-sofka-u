package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.ContractTerm;

public class UpdateContractTerm implements Command {

    private ContractTerm contractTerm;

    public UpdateContractTerm(ContractTerm contractTerm) {
        this.contractTerm = contractTerm;
    }

    public ContractTerm getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(ContractTerm contractTerm) {
        this.contractTerm = contractTerm;
    }
}
