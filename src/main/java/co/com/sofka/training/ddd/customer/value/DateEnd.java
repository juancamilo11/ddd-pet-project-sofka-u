package co.com.sofka.training.ddd.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class DateEnd implements ValueObject<LocalDate> {
    private LocalDate dateEnd;

    public DateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public LocalDate value() {
        return this.dateEnd;
    }
}
