package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.JobPosition;

public class UpdateJobPosition implements Command {

    private JobPosition jobPosition;

    public UpdateJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }
}
