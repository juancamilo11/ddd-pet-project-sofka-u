package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.customer.value.DateBegin;

public class UpdateCustomerBonusDateBegin implements Command {

    private DateBegin dateBegin;

    public UpdateCustomerBonusDateBegin(DateBegin dateBegin) {
        this.dateBegin = dateBegin;
    }

    public DateBegin getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(DateBegin dateBegin) {
        this.dateBegin = dateBegin;
    }
}
