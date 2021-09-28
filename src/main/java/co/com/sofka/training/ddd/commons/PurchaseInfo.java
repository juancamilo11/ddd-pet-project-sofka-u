package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class PurchaseInfo implements ValueObject<String> {

    private String location;
    private LocalDate purchaseDate;

    public PurchaseInfo(String location, LocalDate purchaseDate) {
        this.location = location;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String value() {
        return "Purchase: Location: " + this.location + ", at: " + purchaseDate;
    }
}
