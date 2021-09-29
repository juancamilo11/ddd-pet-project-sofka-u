package co.com.sofka.training.ddd.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.SaleInfo;

public class SaleInfoUpdated extends DomainEvent {

    private SaleInfo saleInfo;

    public SaleInfoUpdated(SaleInfo saleInfo){
        super("sofka.sale.saleinfoupdated");
        this.saleInfo = saleInfo;
    }

    public SaleInfo getSaleInfo() {
        return this.saleInfo;
    }
}
