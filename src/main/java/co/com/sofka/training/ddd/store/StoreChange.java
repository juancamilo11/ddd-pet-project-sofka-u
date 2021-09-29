package co.com.sofka.training.ddd.store;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.training.ddd.store.events.*;

public class StoreChange extends EventChange {

    public StoreChange(Store store){

        apply((StoreCreated event) -> {
            store.storeName = event.getStoreName();
            store.phoneNumber = event.getPhoneNumber();
            store.address = event.getAddress();
            store.email = event.getEmail();
            store.moneyQuantity = event.getMoneyQuantity();
        });

        apply((StoreNameUpdated event) -> store.storeName = event.getStoreName());

        apply((StorePhoneNumberUpdated event) -> store.phoneNumber = event.getPhoneNumber());

        apply((StoreAddressUpdated event) -> store.address = event.getAddress());

        apply((StoreEmailUpdated event) -> store.email = event.getEmail());

        apply((StoreMoneyQuantityUpdated event) -> store.moneyQuantity = event.getMoneyQuantity());



    }
}
