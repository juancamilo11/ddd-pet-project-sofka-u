package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;

public class EmploymentContractId extends Identity {

    private EmploymentContractId(String id){
        super(id);
    }

    public static EmploymentContractId of(String id){
        return new EmploymentContractId(id);
    }

}
