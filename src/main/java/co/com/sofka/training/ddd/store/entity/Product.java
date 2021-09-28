package co.com.sofka.training.ddd.store.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.Iva;
import co.com.sofka.training.ddd.store.values.*;

public class Product extends Entity<ProductId> {

    private ProductName productName;
    private ProductCategory productCategory;
    private StockQuantity stockQuantity;
    private ProductWeight weight;
    private ExpirationDate expirationDate;
    private Iva iva;


    public Product(ProductId productId) {
        super(productId);
    }


}
