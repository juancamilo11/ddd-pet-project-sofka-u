package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class DateEnd implements ValueObject<LocalDate> {
    private LocalDate dateEnd;

    public DateEnd(LocalDate dateEnd) {
        this.dateEnd = Objects.requireNonNull(dateEnd);
    }

    @Override
    public LocalDate value() {
        return this.dateEnd;
    }
}
