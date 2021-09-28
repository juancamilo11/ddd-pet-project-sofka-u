package co.com.sofka.training.ddd.sale.values;

import co.com.sofka.domain.generic.Identity;

public class SaleId extends Identity {

    private SaleId(String id){
        super(id);
    }

    public static SaleId of(String id){
        return new SaleId(id);
    }

}
