package co.com.sofka.training.ddd.store.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.store.values.ProductCategory;
import co.com.sofka.training.ddd.store.values.ProductId;
import co.com.sofka.training.ddd.store.values.ProductName;
import co.com.sofka.training.ddd.store.values.StockQuantity;

public class Product extends Entity<ProductId> {

    private ProductName productName;
    private ProductCategory productCategory;
    private StockQuantity quantity;

    public Product(ProductId productId) {
        super(productId);
    }


}
