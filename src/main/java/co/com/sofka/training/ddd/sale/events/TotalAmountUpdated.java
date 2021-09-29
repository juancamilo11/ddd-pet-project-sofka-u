package co.com.sofka.training.ddd.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.TotalAmount;

public class TotalAmountUpdated extends DomainEvent {

    private TotalAmount totalAmount;

    public TotalAmountUpdated(TotalAmount totalAmount){
        super("sofka.sale.totalamountupdated");
        this.totalAmount = totalAmount;
    }

    public TotalAmount getTotalAmount() {
        return this.totalAmount;
    }
}
