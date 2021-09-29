package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.eployee.value.WorkingTime;

public class UpdateWorkingTime implements Command {

    private WorkingTime workingTime;

    public UpdateWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }

    public WorkingTime getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }
}
