package co.com.sofka.training.ddd.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;

public class CustomerBonusAdded extends DomainEvent {

    private final CustomerBonusId customerBonusId;
    private final DateBegin dateBegin;
    private final DateEnd dateEnd;
    private final DiscountPercent discountPercent;

    public CustomerBonusAdded(CustomerBonusId customerBonusId, DateBegin dateBegin, DateEnd dateEnd, DiscountPercent discountPercent) {
        super("sofka.customer.customerbonusadded");
        this.customerBonusId = customerBonusId;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.discountPercent = discountPercent;
    }

    public CustomerBonusId getCustomerBonusId(){
        return this.customerBonusId;
    }

    public DateBegin getDateBegin() {
        return this.dateBegin;
    }

    public DateEnd getDateEnd() {
        return this.dateEnd;
    }

    public DiscountPercent getDiscountPercent() {
        return this.discountPercent;
    }
}
