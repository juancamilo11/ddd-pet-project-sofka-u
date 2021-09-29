package co.com.sofka.training.ddd.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.value.*;
import co.com.sofka.training.ddd.sale.entity.Bill;
import co.com.sofka.training.ddd.sale.events.*;
import co.com.sofka.training.ddd.sale.values.SaleId;
import co.com.sofka.training.ddd.store.values.ProductId;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sale extends AggregateEvent<SaleId> {

    private CustomerId customerId;
    private List<ProductId> productIdList;
    private Bill bill;

    public Sale(SaleId saleId) {
        super(saleId);
        appendChange(new SaleCreated(customerId)).apply();
    }

    public void addProduct(ProductId productId){
        Objects.requireNonNull(productId);
        if(this.productIdList == null) {
            this.productIdList = new ArrayList<>();
        }
        this.productIdList.add(productId);
    }

    public void deleteProduct(ProductId id){
        this.productIdList
                .stream()
                .filter(productId -> productId.equals(id));
    }

    public void updateParchaseInfo(SaleInfo purchaseInfo){
        Objects.requireNonNull(purchaseInfo);
        appendChange(new SaleInfoUpdated(purchaseInfo)).apply();
    }

    public void updateTotalAmount(TotalAmount totalAmount){
        Objects.requireNonNull(totalAmount);
        appendChange(new TotalAmountUpdated(totalAmount)).apply();
    }

    public void updateTotalDiscount(TotalDiscount totalDiscount){
        Objects.requireNonNull(totalDiscount);
        appendChange(new TotalDiscountUpdated(totalDiscount)).apply();
    }

    public void updateIva(Iva iva){
        Objects.requireNonNull(iva);
        appendChange(new IvaUpdated(iva)).apply();
    }

}
