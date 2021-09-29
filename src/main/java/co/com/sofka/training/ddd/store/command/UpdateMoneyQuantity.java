package co.com.sofka.training.ddd.store.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.MoneyQuantity;

public class UpdateMoneyQuantity implements Command {

    private MoneyQuantity moneyQuantity;

    public UpdateMoneyQuantity(MoneyQuantity moneyQuantity) {
        this.moneyQuantity = moneyQuantity;
    }

    public MoneyQuantity getMoneyQuantity() {
        return moneyQuantity;
    }

    public void setMoneyQuantity(MoneyQuantity moneyQuantity) {
        this.moneyQuantity = moneyQuantity;
    }
}
