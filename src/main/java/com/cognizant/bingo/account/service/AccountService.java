package com.cognizant.bingo.account.service;

import com.cognizant.bingo.account.domain.Account;
import com.cognizant.bingo.account.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;

    public Account createAccount(Account account) {
        accountRepository.save(account);

        return account;
    }

    public Account retrieveAccount(String accountId) {
        Optional<Account> accountDB = accountRepository.findById(accountId);
        return accountDB.get();
    }

    public String updateAccount(String accountId, Account account) {
        Optional<Account> accountDB = accountRepository.findById(accountId);
        String res;

        if (!accountDB.isPresent())
            res = "Account does not exists";
        else {
            account.setAccountNumber(accountId);
            accountRepository.save(account);
            res = "Account successfully updated";
        }

        return res;
    }

    public String deleteAccount(String accountId) {
        accountRepository.deleteById(accountId);
        return "Account successfully deleted";
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
