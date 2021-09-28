package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.Identity;

public class CustomerBonusId extends Identity {

    private CustomerBonusId(String id){
        super(id);
    }

    public static CustomerBonusId of(String id){
        return new CustomerBonusId(id);
    }

}
