package co.com.sofka.training.ddd.sale.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.*;
import co.com.sofka.training.ddd.customer.value.CustomerId;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;
import co.com.sofka.training.ddd.eployee.value.BillId;
import co.com.sofka.training.ddd.store.values.ProductId;

import java.util.List;
import java.util.Objects;

public class Bill extends Entity<BillId> {

    private final CustomerId customerId;
    private SaleInfo saleInfo;
    private TotalAmount totalAmount;
    private TotalDiscount totalDiscount;
    private Iva iva;

    List<ProductId> productIdList;

    public Bill(BillId billId, CustomerId customerId, SaleInfo saleInfo, TotalAmount totalAmount,
                TotalDiscount totalDiscount, Iva iva) {
        super(billId);
        this.customerId = customerId;
        this.saleInfo = saleInfo;
        this.totalAmount = totalAmount;
        this.totalDiscount = totalDiscount;
        this.iva = iva;
    }

    public CustomerId customerId() {
        return this.customerId;
    }

    public SaleInfo saleInfo() {
        return this.saleInfo;
    }

    public void updateSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public TotalAmount totalAmount() {
        return this.totalAmount;
    }

    public void updateTotalAmount(TotalAmount totalAmount) {
        this.totalAmount = totalAmount;
    }

    public TotalDiscount totalDiscount() {
        return this.totalDiscount;
    }

    public void updateTotalDiscount(TotalDiscount totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Iva iva() {
        return this.iva;
    }

    public void updateIva(Iva iva) {
        this.iva = iva;
    }

    public List<ProductId> productIdList() {
        return this.productIdList;
    }

}
