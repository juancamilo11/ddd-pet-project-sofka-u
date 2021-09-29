package co.com.sofka.training.ddd.sale.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.store.values.ProductId;

public class productAdded extends DomainEvent {
    private ProductId productId;

    public productAdded(ProductId productId){
        super("sofka.sale.productadded");
        this.productId = productId;
    }

    public ProductId getProductId() {
        return this.productId;
    }
}
