package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.DiscountPercent;

public class UpdateCustomerBonusPercentDiscount implements Command {

    private DiscountPercent discountPercent;

    public UpdateCustomerBonusPercentDiscount(DiscountPercent discountPercent) {
        this.discountPercent = discountPercent;
    }

    public DiscountPercent getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(DiscountPercent discountPercent) {
        this.discountPercent = discountPercent;
    }
}
