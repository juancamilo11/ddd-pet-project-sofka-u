package co.com.sofka.training.ddd.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.customer.value.DateEnd;

public class UpdateCustomerBonusDateEnd implements Command {

    private DateEnd dateEnd;

    public UpdateCustomerBonusDateEnd(DateEnd dateEnd) {
        this.dateEnd = dateEnd;
    }

    public DateEnd getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(DateEnd dateEnd) {
        this.dateEnd = dateEnd;
    }
}
