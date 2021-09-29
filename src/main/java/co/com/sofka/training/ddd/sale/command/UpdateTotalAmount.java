package co.com.sofka.training.ddd.sale.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.TotalAmount;

public class UpdateTotalAmount implements Command {
    private TotalAmount totalAmount;

    public UpdateTotalAmount(TotalAmount totalAmount) {
        this.totalAmount = totalAmount;
    }

    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(TotalAmount totalAmount) {
        this.totalAmount = totalAmount;
    }
}
