package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class JobPosition implements ValueObject<String> {

    private String jobPosition;

    public JobPosition(String jobPosition) {
        this.jobPosition = Objects.requireNonNull(jobPosition);
    }

    @Override
    public String value() {
        return this.jobPosition;
    }
}
