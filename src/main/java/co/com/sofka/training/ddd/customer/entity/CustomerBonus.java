package co.com.sofka.training.ddd.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;

public class CustomerBonus extends Entity<CustomerBonusId> {



    public CustomerBonus(CustomerBonusId entityId) {
        super(entityId);
    }
}
