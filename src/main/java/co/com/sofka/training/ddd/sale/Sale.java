package co.com.sofka.training.ddd.sale;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.customer.value.CustomerId;
import co.com.sofka.training.ddd.sale.entity.Bill;
import co.com.sofka.training.ddd.sale.values.SaleId;
import co.com.sofka.training.ddd.store.values.ProductId;

import java.util.List;

public class Sale extends Entity<SaleId> {

    private CustomerId customerId;

    private Bill bill;
    private List<ProductId> productIdList;

    public Sale(SaleId saleId) {
        super(saleId);
    }
}
