package co.com.sofka.training.ddd.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.MoneyQuantity;
import co.com.sofka.training.ddd.store.values.StoreName;

public class StoreMoneyQuantityUpdated extends DomainEvent {

    private final MoneyQuantity moneyQuantity;

    public StoreMoneyQuantityUpdated(MoneyQuantity moneyQuantity) {
        super("sofka.store.storemoneyquantityupdated");
        this.moneyQuantity = moneyQuantity;
    }

    public MoneyQuantity getMoneyQuantity() {
        return this.moneyQuantity;
    }

}
