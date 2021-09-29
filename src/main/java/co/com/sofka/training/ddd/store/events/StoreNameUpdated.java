package co.com.sofka.training.ddd.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.store.values.StoreName;

public class StoreNameUpdated extends DomainEvent {

    private final StoreName storeName;

    public StoreNameUpdated(StoreName storeName) {
        super("sofka.store.storenameupdated");
        this.storeName = storeName;
    }

    public StoreName getStoreName() {
        return this.storeName;
    }
}
