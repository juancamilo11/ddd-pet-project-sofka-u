package co.com.sofka.training.ddd.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.MoneyQuantity;

public class CustomerMoneyQuantityUpdated extends DomainEvent {
    private final MoneyQuantity moneyQuantity;

    public CustomerMoneyQuantityUpdated(MoneyQuantity moneyQuantity) {
        super("sofka.customer.customermoneyquantityupdated");
        this.moneyQuantity = moneyQuantity;
    }

    public MoneyQuantity getMoneyQuantity() {
        return this.moneyQuantity;
    }
}
