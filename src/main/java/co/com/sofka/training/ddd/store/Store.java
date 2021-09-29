package co.com.sofka.training.ddd.store;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;
import co.com.sofka.training.ddd.store.entity.Product;
import co.com.sofka.training.ddd.store.event.*;
import co.com.sofka.training.ddd.store.values.*;

import java.util.*;

public class Store extends AggregateEvent<StoreId> {

    protected StoreName storeName;
    protected Address address;
    protected Email email;
    protected PhoneNumber phoneNumber;
    protected MoneyQuantity moneyQuantity;

    protected List<Product> productList;
    protected Set<EmployeeId> employeeIdSet;

    public Store(StoreName storeName, StoreId storeId, Address address, Email email, PhoneNumber phoneNumber,
                 MoneyQuantity moneyQuantity) {
        super(storeId);
        appendChange(new StoreCreated(storeName, phoneNumber, address, email, moneyQuantity));
    }

    public Store(StoreId storeId){
        super(storeId);
        subscribe(new StoreChange(this));
    }

    public static Store from(StoreId storeId, List<DomainEvent> eventList){
        var store = new Store(storeId);
        eventList.forEach(store::applyEvent);
        return store;
    }

    public void addEmployee(EmployeeId employeeId){
        Objects.requireNonNull(employeeId);
        appendChange(new EmployeeAdded(employeeId));
    }

    public void addProduct(ProductName productName, ProductCategory productCategory,
                           StockQuantity stockQuantity, ProductWeight weight,
                           ExpirationDate expirationDate, Iva iva){
        Objects.requireNonNull(productName);
        Objects.requireNonNull(productCategory);
        Objects.requireNonNull(stockQuantity);
        Objects.requireNonNull(weight);
        Objects.requireNonNull(expirationDate);
        Objects.requireNonNull(iva);
        appendChange(new ProductAdded(productName, productCategory, stockQuantity, weight,expirationDate,iva));
    }

    public void removeProduct(ProductId productId){
        Objects.requireNonNull(productId);
        appendChange(new ProductRemoved(productId));
    }

    public void removeEmployee(EmployeeId employeeId){
        Objects.requireNonNull(employeeId);
        appendChange(new EmployeeRemoved(employeeId));
    }

    public Optional<Product> getProductById(ProductId productId){
        Objects.requireNonNull(productId);
        return this.productList
                .stream()
                .filter(function -> function.identity().equals(productId))
                .findFirst();
    }

    public void updateStoreName(StoreName storeName){
        Objects.requireNonNull(storeName);
        appendChange(new StoreNameUpdated(storeName)).apply();
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber){
        Objects.requireNonNull(phoneNumber);
        appendChange(new StorePhoneNumberUpdated(phoneNumber)).apply();
    }

    public void updateAddress(Address address){
        Objects.requireNonNull(address);
        appendChange(new StoreAddressUpdated(address)).apply();
    }

    public void updateEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new StoreEmailUpdated(email)).apply();
    }

    public void updateMoneyQuantity(MoneyQuantity moneyQuantity){
        Objects.requireNonNull(moneyQuantity);
        appendChange(new StoreMoneyQuantityUpdated(moneyQuantity)).apply();
    }
}
