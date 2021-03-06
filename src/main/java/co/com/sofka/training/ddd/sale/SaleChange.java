package co.com.sofka.training.ddd.sale;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.training.ddd.sale.event.*;

public class SaleChange extends EventChange {
    public SaleChange(Sale sale){

        apply((SaleCreated event) -> {
            sale.saleInfo = event.getSaleInfo();
        });

        apply((SaleInfoUpdated event) -> sale.saleInfo = event.getSaleInfo());

        apply((TotalAmountUpdated event) -> sale.updateTotalAmount(event.getTotalAmount()));

        apply((TotalDiscountUpdated event) -> sale.updateTotalDiscount(event.getTotalDiscount()));

        apply((IvaUpdated event) -> sale.updateIva(event.getIva()));

        apply((productAdded event) -> sale.addProduct(event.getProductId()));
    }
}
