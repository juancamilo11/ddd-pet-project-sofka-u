package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.Identity;

public class BillId extends Identity {

    private BillId(String id) {
        super(id);
    }

    public static BillId of(String id){
        return new BillId(id);
    }

}
