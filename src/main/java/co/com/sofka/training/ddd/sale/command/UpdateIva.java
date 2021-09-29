package co.com.sofka.training.ddd.sale.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.Iva;

public class UpdateIva implements Command {

    private Iva iva;

    public UpdateIva(Iva iva) {
        this.iva = iva;
    }

    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }
}
