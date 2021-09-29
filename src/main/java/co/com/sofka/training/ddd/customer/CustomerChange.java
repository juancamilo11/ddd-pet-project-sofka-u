package co.com.sofka.training.ddd.customer;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.training.ddd.customer.entity.CustomerFunction;
import co.com.sofka.training.ddd.customer.events.*;

import java.util.Optional;

public class CustomerChange extends EventChange {
    public CustomerChange(Customer customer){
        apply((CustomerCreated event) -> {
            customer.fullName = event.getFullName();
            customer.phoneNumber = event.getPhoneNumber();
            customer.address = event.getAddress();
            customer.email = event.getEmail();
            customer.moneyQuantity = event.getMoneyQuantity();
        });

        apply((CustomerFullNameUpdated event) -> customer.fullName = event.getFullName());

        apply((CustomerPhoneNumberUpdated event) -> customer.phoneNumber = event.getPhoneNumber());

        apply((CustomerAddressUpdated event) -> customer.address = event.getAddress());

        apply((CustomerEmailUpdated event) -> customer.email = event.getEmail());

        apply((CustomerMoneyQuantityUpdated event) -> customer.moneyQuantity = event.getMoneyQuantity());

        apply((CustomerFunctionDescriptionUpdated event) -> {
            CustomerFunction function = customer.getCustomerFunctionById(event.getCustomerFunctionId()).orElseThrow();
            function.updateFunctionDescription(event.getFunctionDescription());
        });

        apply((CustomerFunctionCharacteristicUpdated event) -> {
            CustomerFunction function = customer.getCustomerFunctionById(event.customerFunctionId()).orElseThrow();
            function.updatefunctionCharacteristic(event.functionCharacteristic());
        });

        apply((CustomerBonusDateBeginUpdated event) -> customer.updateCustomerBonusDateBegin(event.getDateBegin()));

        apply((CustomerBonusDateEndUpdated event) -> customer.updateCustomerBonusDateEnd(event.getDateEnd()));

        apply((CustomerBonusDiscountPercentUpdated event) -> customer.updateCustomerBonusPercentDiscount(event.getDiscountPercent()));

        apply((CustomerFunctionAdded event) -> customer.addCustomerFunction(event.getCustomerFunctionId(),
                                    event.getFunctionDescription(),
                                    event.getFunctionCharacteristic()));

        apply((CustomerBonusAdded event) -> customer.addCustomerBonus(event.getCustomerBonusId(),
                                  event.getDateBegin(),
                                  event.getDateEnd(),
                                  event.getDiscountPercent()));
    }
}
