package co.com.sofka.training.ddd.sale.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.TotalDiscount;

public class UpdateTotalDiscount implements Command {

    private TotalDiscount totalDiscount;

    public UpdateTotalDiscount(TotalDiscount totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public TotalDiscount getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(TotalDiscount totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
}
