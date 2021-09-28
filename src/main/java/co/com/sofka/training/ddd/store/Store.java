package co.com.sofka.training.ddd.store;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.eployee.Employee;
import co.com.sofka.training.ddd.sale.values.SaleId;
import co.com.sofka.training.ddd.store.entity.Product;
import co.com.sofka.training.ddd.store.values.StoreId;

import java.util.List;
import java.util.Set;

public class Store extends Entity<StoreId> {

    private SaleId saleId;
    private Address address;
    private Email email;
    private PhoneNumber phoneNumber;
    private MoneyQuantity moneyQuantity;

    private List<Product> productList;
    private Set<Employee> employeeSet;

    public Store(StoreId entityId) {
        super(entityId);
    }
}
