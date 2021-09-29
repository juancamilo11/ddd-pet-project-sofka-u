package co.com.sofka.training.ddd.eployee;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.training.ddd.customer.entity.CustomerFunction;
import co.com.sofka.training.ddd.customer.events.*;
import co.com.sofka.training.ddd.eployee.entity.EmployeeFunction;
import co.com.sofka.training.ddd.eployee.events.*;

public class EmployeeChange extends EventChange {

    public EmployeeChange(Employee employee){

        apply((EmployeeCreated event)->{
            employee.fullName = event.getFullName();
            employee.phoneNumber = event.getPhoneNumber();
            employee.address = event.getAddress();
            employee.email = event.getEmail();
        });

        apply((EmployeeFullNameUpdated event) -> employee.fullName = event.getFullName());

        apply((EmployeePhoneNumberUpdated event) -> employee.phoneNumber = event.getPhoneNumber());

        apply((EmployeeAddressUpdated event) -> employee.address = event.getAddress());

        apply((EmployeeEmailUpdated event) -> employee.email = event.getEmail());

        apply((EmployeeFunctionDescriptionUpdated event) -> {
            EmployeeFunction function = employee.getEmployeeFunctionById(event.getEmployeeFunctionId()).orElseThrow();
            function.updateFunctionDescription(event.getFunctionDescription());
        });

        apply((EmployeeFunctionCharacteristicUpdated event) -> {
            EmployeeFunction function = employee.getEmployeeFunctionById(event.getEmployeeFunctionId()).orElseThrow();
            function.updateFunctionCharacteristic(event.getFunctionCharacteristic());
        });

        apply((EmployeeFunctionAdded event) -> employee.addEmployeeFunction(event.getCustomerFunctionId(),
                event.getFunctionDescription(),
                event.getFunctionCharacteristic()));

        apply((EmploymentContractAdded event) -> employee.addEmploymentContract(event.getEmploymentContractId(),
                event.getSalary(),
                event.getJobPosition(),
                event.getWorkingTime(),
                event.getContractTerm()));

        apply((EmployeeJobPositionUpdated event) -> employee.employmentContract.updateJobPosition(event.getJobPosition()));

        apply((EmployeeWorkingTimeUpdated event) -> employee.employmentContract.updateWorkingTime(event.getWorkingTime()));

        apply((EmployeeSalaryUpdated event) -> employee.employmentContract.updateSalary(event.getSalary()));

        apply((EmployeeContractTermUpdated event) -> employee.employmentContract.updateContractTerm(event.getContractTerm()));
    }
}
