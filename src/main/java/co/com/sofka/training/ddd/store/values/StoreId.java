package co.com.sofka.training.ddd.store.values;

import co.com.sofka.domain.generic.Identity;

public class StoreId extends Identity {

    private StoreId(String id){
        super(id);
    }

    public static StoreId of(String id){
        return new StoreId(id);
    }

}
