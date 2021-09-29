package co.com.sofka.training.ddd.store.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.store.values.ProductId;

public class ProductRemoved extends DomainEvent {

    private final ProductId productId;


    public ProductRemoved(ProductId productId) {
        super("sofka.store.productremoved");
        this.productId = productId;
    }

    public ProductId getProductId() {
        return this.productId;
    }

}
