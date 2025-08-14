package ma.enset.digital-bankingbackend.mappers;

import ma.enset.digital-bankingbackend.dtos.AccountOperationDTO;
import ma.enset.digital-bankingbackend.dtos.CurrentAccountDTO;
import ma.enset.digital-bankingbackend.dtos.CustomerDTO;
import ma.enset.digital-bankingbackend.dtos.SavingAccountDTO;
import ma.enset.digital-bankingbackend.entities.AccountOperation;
import ma.enset.digital-bankingbackend.entities.CurrentAccount;
import ma.enset.digital-bankingbackend.entities.Customer;
import ma.enset.digital-bankingbackend.entities.SavingAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImpl {

    public CustomerDTO fromCustomerToCustomerDTO(Customer customer) {
        CustomerDTO dto = new CustomerDTO();
        BeanUtils.copyProperties(customer, dto);
        return dto;
    }

    public Customer fromCustomerDTOToCustomer(CustomerDTO dto) {
        Customer entity = new Customer();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public CurrentAccountDTO fromCurrentAccountToCurrentAccountDTO(CurrentAccount entity) {
        CurrentAccountDTO dto = new CurrentAccountDTO();
        BeanUtils.copyProperties(entity, dto);
        dto.setType("CurrentAccount");
        return dto;
    }

    public SavingAccountDTO fromSavingAccountToSavingAccountDTO(SavingAccount entity) {
        SavingAccountDTO dto = new SavingAccountDTO();
        BeanUtils.copyProperties(entity, dto);
        dto.setType("SavingAccount");
        return dto;
    }

    public AccountOperationDTO fromAccountToAccountOperationDTO(AccountOperation entity) {
        AccountOperationDTO dto = new AccountOperationDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
