package co.com.sofka.training.ddd.store;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.entity.CustomerFunction;
import co.com.sofka.training.ddd.customer.events.*;
import co.com.sofka.training.ddd.customer.value.CustomerFunctionId;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;
import co.com.sofka.training.ddd.eployee.Employee;
import co.com.sofka.training.ddd.sale.values.SaleId;
import co.com.sofka.training.ddd.store.entity.Product;
import co.com.sofka.training.ddd.store.events.*;
import co.com.sofka.training.ddd.store.values.StoreId;
import co.com.sofka.training.ddd.store.values.StoreName;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Store extends AggregateEvent<StoreId> {

    private SaleId saleId;
    private StoreName storeName;
    private Address address;
    private Email email;
    private PhoneNumber phoneNumber;
    private MoneyQuantity moneyQuantity;

    private List<Product> productList;
    private Set<Employee> employeeSet;

    public Store(StoreId storeId, SaleId saleId, Address address, Email email, PhoneNumber phoneNumber,
                 MoneyQuantity moneyQuantity, List<Product> productList, Set<Employee> employeeSet) {
        super(storeId);
        this.saleId = saleId;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.moneyQuantity = moneyQuantity;
        this.productList = productList;
        this.employeeSet = employeeSet;
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
