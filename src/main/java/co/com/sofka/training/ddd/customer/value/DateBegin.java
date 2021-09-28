package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class DateBegin implements ValueObject<LocalDate> {

    private LocalDate dateBegin;

    public DateBegin(LocalDate dateBegin) {
        this.dateBegin = Objects.requireNonNull(dateBegin);
    }

    @Override
    public LocalDate value() {
        return this.dateBegin;
    }
}
