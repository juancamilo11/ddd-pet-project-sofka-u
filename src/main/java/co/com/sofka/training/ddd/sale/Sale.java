package co.com.sofka.training.ddd.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.value.*;
import co.com.sofka.training.ddd.eployee.value.BillId;
import co.com.sofka.training.ddd.sale.entity.Bill;
import co.com.sofka.training.ddd.sale.events.*;
import co.com.sofka.training.ddd.sale.values.SaleId;
import co.com.sofka.training.ddd.store.values.ProductId;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sale extends AggregateEvent<SaleId> {

    protected List<ProductId> productIdList;
    protected SaleInfo saleInfo;
    protected Bill bill;

    public Sale(SaleId saleId, BillId billId, CustomerId customerId,
                SaleInfo saleInfo, TotalAmount totalAmount,
                TotalDiscount totalDiscount, Iva iva) {
        super(saleId);
        productIdList = new ArrayList<>();
        this.bill = new Bill(billId,customerId, saleInfo, totalAmount, totalDiscount, iva);
        appendChange(new SaleCreated(saleId, saleInfo)).apply();
    }

    public void addProduct(ProductId productId){
        Objects.requireNonNull(productId);
        appendChange(new productAdded(productId)).apply();
    }

    public void updateSaleInfo(SaleInfo saleInfo){
        Objects.requireNonNull(saleInfo);
        appendChange(new SaleInfoUpdated(saleInfo)).apply();
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
