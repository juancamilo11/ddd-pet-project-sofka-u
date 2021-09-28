package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ContractTerm implements ValueObject<String> {

    private String contractTerm;

    public ContractTerm(String contractTerm) {
        this.contractTerm = Objects.requireNonNull(contractTerm);
    }

    @Override
    public String value() {
        return this.contractTerm;
    }
}
