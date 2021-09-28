package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MoneyQuantity implements ValueObject<String> {

    private final double moneyQuantity;
    private final String currency;

    public MoneyQuantity(double moneyQuantity , String currency){
        this.moneyQuantity = Objects.requireNonNull(moneyQuantity);
        this.currency = Objects.requireNonNull(currency);
    }

    @Override
    public String value() {
        return this.moneyQuantity + " " + this.currency;
    }

}
