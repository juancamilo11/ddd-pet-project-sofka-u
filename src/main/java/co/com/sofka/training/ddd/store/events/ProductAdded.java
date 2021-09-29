package co.com.sofka.training.ddd.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.training.ddd.commons.Iva;
import co.com.sofka.training.ddd.store.values.*;

public class ProductAdded extends DomainEvent {

    private final ProductName productName;
    private final ProductCategory productCategory;
    private final StockQuantity stockQuantity;
    private final ProductWeight productWeight;
    private final ExpirationDate expirationDate;
    private final Iva iva;

    public ProductAdded(ProductName productName, ProductCategory productCategory,
                              StockQuantity stockQuantity, ProductWeight productWeight,
                              ExpirationDate expirationDate, Iva iva) {
        super("sofka.store.productadded");
        this.productName = productName;
        this.productCategory = productCategory;
        this.stockQuantity = stockQuantity;
        this.productWeight = productWeight;
        this.expirationDate = expirationDate;
        this.iva = iva;
    }

    public ProductName getProductName() {
        return this.productName;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public StockQuantity getStockQuantity() {
        return this.stockQuantity;
    }

    public ProductWeight getProductWeight() {
        return this.productWeight;
    }

    public ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public Iva getIva() {
        return this.iva;
    }
}
