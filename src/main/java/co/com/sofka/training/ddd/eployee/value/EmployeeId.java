package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.Identity;

public class EmployeeId extends Identity {
    private EmployeeId(String id){
        super(id);
    }

    public static EmployeeId of(String id){
        return new EmployeeId(id);
    }
}
