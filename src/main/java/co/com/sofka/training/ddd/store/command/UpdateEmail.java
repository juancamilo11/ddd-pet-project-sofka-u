package co.com.sofka.training.ddd.store.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.Email;

public class UpdateEmail implements Command {

    private Email email;

    public UpdateEmail(Email email) {
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
