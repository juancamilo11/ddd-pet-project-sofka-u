package co.com.sofka.training.ddd.sale.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.Iva;
import co.com.sofka.training.ddd.commons.TotalAmount;
import co.com.sofka.training.ddd.commons.TotalDiscount;
import co.com.sofka.training.ddd.customer.value.CustomerId;
import co.com.sofka.training.ddd.eployee.value.BillId;
import co.com.sofka.training.ddd.commons.SaleInfo;
import co.com.sofka.training.ddd.store.values.ProductId;

import java.util.List;

public class Bill extends Entity<BillId> {

    private CustomerId customerId;
    private SaleInfo purchaseInfo;
    private TotalAmount totalAmount;
    private TotalDiscount totalDiscount;
    private Iva iva;

    List<ProductId> productIdList;

    public Bill(BillId billId, CustomerId customerId, SaleInfo purchaseInfo, TotalAmount totalAmount,
                TotalDiscount totalDiscount, Iva iva) {
        super(billId);
    }



}
