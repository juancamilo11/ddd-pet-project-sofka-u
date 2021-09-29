package co.com.sofka.training.ddd.eployee.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.FullName;

public class UpdateFullName implements Command {
    private FullName fullName;

    public UpdateFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
}
