package co.com.sofka.training.ddd.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.DiscountPercent;
import co.com.sofka.training.ddd.customer.value.BonusPeriod;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;

public class CustomerBonus extends Entity<CustomerBonusId> {

    private BonusPeriod bonusPeriod;
    private DiscountPercent discountPercent;

    public CustomerBonus(CustomerBonusId CustomerBonusId, BonusPeriod bonusPeriod, DiscountPercent discountPercent) {
        super(CustomerBonusId);
        this.bonusPeriod = bonusPeriod;
        this.discountPercent = discountPercent;
    }

}
