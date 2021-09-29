package co.com.sofka.training.ddd.sale.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.store.values.ProductId;

public class AddProduct implements Command {

    private ProductId productId;

    public AddProduct(ProductId productId) {
        this.productId = productId;
    }

    public ProductId getProductId() {
        return productId;
    }

    public void setProductId(ProductId productId) {
        this.productId = productId;
    }
}
