package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.Identity;

public class CustomerFunctionId extends Identity {

    private CustomerFunctionId(String id){
        super(id);
    }

    public static CustomerFunctionId of(String id){
        return new CustomerFunctionId(id);
    }

}
