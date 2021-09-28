package co.com.sofka.training.ddd.customer.values;

import co.com.sofka.domain.generic.Identity;

public class CustomerBonusId extends Identity {

    public CustomerBonusId(String id){
        super(id);
    }

    public static CustomerBonusId of(String id){
        return new CustomerBonusId(id);
    }

}
