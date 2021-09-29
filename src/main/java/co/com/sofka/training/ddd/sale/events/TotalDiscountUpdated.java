package co.com.sofka.training.ddd.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.TotalDiscount;

public class TotalDiscountUpdated extends DomainEvent {

    private TotalDiscount totalDiscount;

    public TotalDiscountUpdated(TotalDiscount totalDiscount){
        super("sofka.sale.totaldiscountupdated");
        this.totalDiscount = totalDiscount;
    }

    public TotalDiscount getTotalDiscount() {
        return this.totalDiscount;
    }

}
