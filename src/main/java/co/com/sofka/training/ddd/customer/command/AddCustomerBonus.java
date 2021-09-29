package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.DiscountPercent;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;

public class AddCustomerBonus implements Command {
    private CustomerBonusId customerBonusId;
    private DateBegin dateBegin;
    private DateEnd dateEnd;
    private DiscountPercent discountPercent;

    public AddCustomerBonus(CustomerBonusId customerBonusId, DateBegin dateBegin, DateEnd dateEnd, DiscountPercent discountPercent) {
        this.customerBonusId = customerBonusId;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.discountPercent = discountPercent;
    }

    public CustomerBonusId getCustomerBonusId() {
        return customerBonusId;
    }

    public void setCustomerBonusId(CustomerBonusId customerBonusId) {
        this.customerBonusId = customerBonusId;
    }

    public DateBegin getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(DateBegin dateBegin) {
        this.dateBegin = dateBegin;
    }

    public DateEnd getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(DateEnd dateEnd) {
        this.dateEnd = dateEnd;
    }

    public DiscountPercent getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(DiscountPercent discountPercent) {
        this.discountPercent = discountPercent;
    }
}
