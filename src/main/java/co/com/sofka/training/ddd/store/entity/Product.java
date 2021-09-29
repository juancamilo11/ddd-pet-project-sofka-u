package co.com.sofka.training.ddd.store.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.DiscountPercent;
import co.com.sofka.training.ddd.commons.Iva;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.DateEnd;
import co.com.sofka.training.ddd.store.values.*;

import java.util.Objects;

public class Product extends Entity<ProductId> {

    private ProductName productName;
    private ProductCategory productCategory;
    private StockQuantity stockQuantity;
    private ProductWeight weight;
    private ExpirationDate expirationDate;
    private Iva iva;

    public Product(ProductId entityId, ProductName productName, ProductCategory productCategory,
                   StockQuantity stockQuantity, ProductWeight weight, ExpirationDate expirationDate, Iva iva) {
        super(entityId);
        this.productName = productName;
        this.productCategory = productCategory;
        this.stockQuantity = stockQuantity;
        this.weight = weight;
        this.expirationDate = expirationDate;
        this.iva = iva;
    }

    public ProductName productName() {
        return this.productName;
    }

    public void updateProductName(ProductName productName) {
        this.productName = productName;
    }

    public ProductCategory productCategory() {
        return this.productCategory;
    }

    public void updateProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public StockQuantity stockQuantity() {
        return this.stockQuantity;
    }

    public void updateStockQuantity(StockQuantity stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public ProductWeight weight() {
        return this.weight;
    }

    public void updateWeight(ProductWeight weight) {
        this.weight = weight;
    }

    public ExpirationDate expirationDate() {
        return this.expirationDate;
    }

    public void updateExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Iva iva() {
        return this.iva;
    }

    public void updateIva(Iva iva) {
        this.iva = iva;
    }
}
