package co.com.sofka.training.ddd.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.customer.value.CustomerId;

public class SaleCreated extends DomainEvent {

    private CustomerId customerId;

    public SaleCreated(CustomerId customerId){
        super("sofka.sale.salecreated");
        this.customerId = customerId;
    }

    public CustomerId getFullName() {
        return this.customerId;
    }

}
