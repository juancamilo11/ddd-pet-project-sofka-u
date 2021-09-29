package co.com.sofka.training.ddd.sale.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.SaleInfo;
import co.com.sofka.training.ddd.sale.values.SaleId;

public class SaleCreated<saleId> extends DomainEvent {
    private SaleInfo saleInfo;
    private SaleId saleId;

    public SaleCreated(SaleId saleId, SaleInfo saleInfo){
        super("sofka.sale.salecreated");
        this.saleInfo = saleInfo;
        this.saleId = saleId;
    }

    public SaleId getSaleId() {
        return this.saleId;
    }

    public SaleInfo getSaleInfo() {
        return this.saleInfo;
    }
}
