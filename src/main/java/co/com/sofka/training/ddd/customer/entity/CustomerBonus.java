package co.com.sofka.training.ddd.customer.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.training.ddd.commons.DiscountPercent;
import co.com.sofka.training.ddd.customer.value.DateBegin;
import co.com.sofka.training.ddd.customer.value.CustomerBonusId;
import co.com.sofka.training.ddd.customer.value.DateEnd;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerBonus extends Entity<CustomerBonusId> {

    private DateBegin dateBegin;
    private DateEnd dateEnd;
    private DiscountPercent discountPercent;

    public CustomerBonus(CustomerBonusId CustomerBonusId, DateBegin dateBegin, DateEnd dateEnd) {
        super(CustomerBonusId);
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public boolean isValid(){
        if(this.dateEnd.value().isBefore(LocalDate.now())){
            return false;
        }
        return true;
    }

    public void updateDateBegin(DateBegin dateBegin){
        this.dateBegin = Objects.requireNonNull(dateBegin);
    }

    public void updateDateEnd(DateEnd dateEnd){
        this.dateEnd = Objects.requireNonNull(dateEnd);
    }

    public DateBegin dateBegin() {
        return this.dateBegin;
    }

    public DateEnd dateEnd() {
        return this.dateEnd;
    }
}
