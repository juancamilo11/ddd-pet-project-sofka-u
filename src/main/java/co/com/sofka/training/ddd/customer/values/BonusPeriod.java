package co.com.sofka.training.ddd.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.Period;

public class BonusPeriod implements ValueObject<Period> {

    private LocalDate dateBegin;
    private LocalDate dateEnd;

    public BonusPeriod(LocalDate dateBegin, LocalDate dateEnd) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    @Override
    public Period value() {
        return Period.between(dateBegin, dateEnd);
    }
}
