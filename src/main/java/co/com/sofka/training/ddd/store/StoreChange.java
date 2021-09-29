package co.com.sofka.training.ddd.store;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.training.ddd.store.event.*;

import java.util.stream.Collectors;

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

        apply((EmployeeRemoved event) -> {
            store.productList = store
                    .productList
                    .stream()
                    .filter(product -> product.identity().equals(event.getEmployeeId()))
                    .collect(Collectors.toList());
        });

        apply((ProductRemoved event) -> {
            if(store.getProductById(event.getProductId()).isPresent()) {
                store.employeeIdSet = store
                        .employeeIdSet
                        .stream()
                        .filter(employeeId -> employeeId.equals(event.getProductId().value()))
                        .collect(Collectors.toSet());
            }
        });

    }
}
