package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class ExpirationDate implements ValueObject<LocalDate> {

    private LocalDate expirationDate;

    public ExpirationDate(LocalDate expirationDate) {
        this.expirationDate = Objects.requireNonNull(expirationDate);
    }

    @Override
    public LocalDate value() {
        return this.expirationDate;
    }

}
