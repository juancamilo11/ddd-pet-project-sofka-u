package co.com.sofka.training.ddd.sale.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Iva;

public class IvaUpdated extends DomainEvent {

    private Iva iva;

    public IvaUpdated(Iva iva){
        super("sofka.sale.ivaupdated");
        this.iva = iva;
    }

    public Iva getIva() {
        return this.iva;
    }

}
