package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class WorkingTime implements ValueObject<String> {

    private String workingTime;
    private String workingDays;

    public WorkingTime(String workingTime, String workingDays) {
        this.workingTime = Objects.requireNonNull(workingTime);
        this.workingDays = Objects.requireNonNull(workingDays);
    }

    @Override
    public String value() {
        return "Working days: " + this.workingDays + ", " + " Working time:" + this.workingTime;
    }
}
