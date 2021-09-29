package co.com.sofka.training.ddd.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class SaleInfo implements ValueObject<String> {

    private String location;
    private LocalDate purchaseDate;

    public SaleInfo(String location, LocalDate purchaseDate) {
        this.location = Objects.requireNonNull(location);
        this.purchaseDate = Objects.requireNonNull(purchaseDate);
    }

    @Override
    public String value() {
        return "Purchase: Location: " + this.location + ", at: " + purchaseDate;
    }
}
