package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;

public class CustomerBonusAdded extends DomainEvent {

    private DateBegin dateBegin;
    private DateEnd dateEnd;
    private DiscountPercent discountPercent;

    public CustomerBonusAdded(CustomerBonusId CustomerBonusId, DateBegin dateBegin, DateEnd dateEnd, DiscountPercent discountPercent) {
        super("sofka.customer.customerbonusadded");
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.discountPercent = discountPercent;
    }



}
