package ma.enset.digital-bankingbackend.services;

import ma.enset.digital-bankingbackend.dtos.*;
import ma.enset.digital-bankingbackend.enums.AccountStatus;
import ma.enset.digital-bankingbackend.exceptions.BalanceNotSufficientException;
import ma.enset.digital-bankingbackend.exceptions.BankAccountNotFoundException;
import ma.enset.digital-bankingbackend.exceptions.CustomerNotFoundException;

import java.time.LocalDate;
import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    CurrentAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, String customerId)
            throws CustomerNotFoundException;

    SavingAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, String customerId)
            throws CustomerNotFoundException;

    List<CustomerDTO> getCustomers();

    BankAccountDTO getBankAccountById(String id) throws BankAccountNotFoundException;

    void debit(String id, double amount, String description)
            throws BankAccountNotFoundException, BalanceNotSufficientException;

    void credit(String id, double amount, String description) throws BankAccountNotFoundException;

    void transfer(String fromId, String toId, double amount)
            throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> getAllBankAccounts();

    CustomerDTO getCustomerById(String id) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id) throws CustomerNotFoundException;

    List<AccountOperationDTO> getHistory(String id);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomer(String keyword);

    List<BankAccountDTO> getAccountsByCustomerId(String customerID) throws CustomerNotFoundException;

    void updateAccountStatus(String id, AccountStatus status) throws BankAccountNotFoundException;

    void cancelOperation(String id) throws BankAccountNotFoundException;

    AccountHistoryDTO searchOperations(String accountId, LocalDate startDate, LocalDate endDate, Double minAmount,
            Double maxAmount, int page, int size) throws BankAccountNotFoundException;

    BankAccountDTO getLatestAccount();

    void updateOverdraftLimit(String id, double newLimit) throws BankAccountNotFoundException;

    void updateInterestRate(String id, double newRate) throws BankAccountNotFoundException;
}
