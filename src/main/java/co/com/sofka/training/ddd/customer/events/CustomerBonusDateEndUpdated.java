package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;

public class CustomerBonusDateEndUpdated extends DomainEvent {

    private DateEnd dateEnd;

    public CustomerBonusDateEndUpdated(DateEnd dateEnd){
        super("sofka.customer.customerbonusdateendupdated");
        this.dateEnd = dateEnd;
    }

    public DateEnd getDateEnd() {
        return this.dateEnd;
    }

}
