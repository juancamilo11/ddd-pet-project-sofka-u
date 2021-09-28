package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

public class MoneyQuantity implements ValueObject<String> {
    private final double moneyQuantity;
    private final String currency;

    public MoneyQuantity(double moneyQuantity , String currency){
        this.moneyQuantity = moneyQuantity;
        this.currency = currency;
    }

    @Override
    public String value() {
        return this.moneyQuantity + " " + this.currency;
    }

}
