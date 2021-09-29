package co.com.sofka.training.ddd.customer.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.customer.value.DateBegin;

public class CustomerBonusDateBeginUpdated extends DomainEvent {

    private DateBegin dateBegin;

    public CustomerBonusDateBeginUpdated(DateBegin dateBegin){
        super("sofka.customer.customerbonusbegindateupdated");
        this.dateBegin = dateBegin;
    }

    public DateBegin getDateBegin() {
        return this.dateBegin;
    }

}
