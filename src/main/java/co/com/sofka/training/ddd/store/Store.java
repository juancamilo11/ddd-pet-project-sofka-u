package co.com.sofka.training.ddd.store;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.eployee.value.EmployeeId;
import co.com.sofka.training.ddd.sale.values.SaleId;
import co.com.sofka.training.ddd.store.entity.Product;
import co.com.sofka.training.ddd.store.events.*;
import co.com.sofka.training.ddd.store.values.ProductId;
import co.com.sofka.training.ddd.store.values.StoreId;
import co.com.sofka.training.ddd.store.values.StoreName;

import java.util.*;

public class Store extends AggregateEvent<StoreId> {

    private SaleId saleId;
    private StoreName storeName;
    private Address address;
    private Email email;
    private PhoneNumber phoneNumber;
    private MoneyQuantity moneyQuantity;

    private List<Product> productList;
    private Set<EmployeeId> employeeIdSet;

    public Store(StoreId storeId, SaleId saleId, Address address, Email email, PhoneNumber phoneNumber,
                 MoneyQuantity moneyQuantity) {
        super(storeId);
        this.saleId = saleId;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.moneyQuantity = moneyQuantity;
    }

    public void addProduct(Product product){
        if(this.productList == null){
            this.productList = new ArrayList<>();
        }
        this.productList.add(product);
    }

    public void addEmployee(EmployeeId employeeId){
        if(this.employeeIdSet == null){
            this.employeeIdSet = new HashSet<>();
        }
        this.employeeIdSet.add(employeeId);
    }

    public Optional<Product> removeProduct(Product prod){
        return this.productList.stream().filter(product -> product.identity().equals(prod)).findFirst();
    }

    public Optional<EmployeeId> removeEmployee(EmployeeId emplId){
        return this.employeeIdSet
                .stream()
                .filter(employeeId -> employeeId.value().equals(emplId.value()))
                .findFirst();
    }

    public Optional<Product> getProductById(ProductId productId){
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
