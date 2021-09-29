package co.com.sofka.training.ddd.sale.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.SaleInfo;

public class UpdateSaleInfo implements Command {

    private SaleInfo saleInfo;

    public UpdateSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }
}
