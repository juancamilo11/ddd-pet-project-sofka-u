package co.com.sofka.training.ddd.customer.values;

import co.com.sofka.domain.generic.Identity;

public class CustomerFunctionId extends Identity {

    public CustomerFunctionId(String id){
        super(id);
    }

    public static CustomerFunctionId of(String id){
        return new CustomerFunctionId(id);
    }

}
