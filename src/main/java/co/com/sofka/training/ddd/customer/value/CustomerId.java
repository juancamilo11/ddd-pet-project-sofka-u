package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.Identity;

public class CustomerId extends Identity {

    private CustomerId(String id){
        super(id);
    }

    public static CustomerId of(String id) {
        return new CustomerId(id);
    }
}
