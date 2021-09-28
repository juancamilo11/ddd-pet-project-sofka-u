package co.com.sofka.training.ddd.eployee.value;

import co.com.sofka.domain.generic.Identity;

public class EmployeeFunctionId extends Identity {

    private EmployeeFunctionId(String id){
        super(id);
    }

    public static EmployeeFunctionId of(String id){
        return new EmployeeFunctionId(id);
    }

}
