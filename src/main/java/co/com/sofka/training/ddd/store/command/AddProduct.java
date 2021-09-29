package co.com.sofka.training.ddd.store.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.training.ddd.commons.Iva;
import co.com.sofka.training.ddd.store.values.*;

public class AddProduct implements Command {

    private ProductName productName;
    private ProductCategory productCategory;
    private StockQuantity stockQuantity;
    private ProductWeight weight;
    private ExpirationDate expirationDate;
    private Iva iva;

    public AddProduct(ProductName productName, ProductCategory productCategory,
                      StockQuantity stockQuantity, ProductWeight weight,
                      ExpirationDate expirationDate, Iva iva) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.stockQuantity = stockQuantity;
        this.weight = weight;
        this.expirationDate = expirationDate;
        this.iva = iva;
    }

    public ProductName getProductName() {
        return productName;
    }

    public void setProductName(ProductName productName) {
        this.productName = productName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public StockQuantity getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(StockQuantity stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public ProductWeight getWeight() {
        return weight;
    }

    public void setWeight(ProductWeight weight) {
        this.weight = weight;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }
}
