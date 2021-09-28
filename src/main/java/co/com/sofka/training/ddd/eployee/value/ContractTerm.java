package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.ValueObject;

public class ContractTerm implements ValueObject<String> {

    private String contractTerm;

    public ContractTerm(String contractTerm) {
        this.contractTerm = contractTerm;
    }

    @Override
    public String value() {
        return this.contractTerm;
    }
}
