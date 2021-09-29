package co.com.sofka.training.ddd.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.DiscountPercent;

public class CustomerBonusDiscountPercentUpdated extends DomainEvent {

    private DiscountPercent discountPercent;

    public CustomerBonusDiscountPercentUpdated(DiscountPercent discountPercent){
        super("sofka.customer.customerbonusdateendupdated");
        this.discountPercent = discountPercent;
    }

    public DiscountPercent getDiscountPercent() {
        return this.discountPercent;
    }

}
