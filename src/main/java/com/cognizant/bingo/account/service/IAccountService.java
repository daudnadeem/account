package com.cognizant.bingo.account.service;

import com.cognizant.bingo.account.domain.Account;

import java.util.List;

public interface IAccountService {
    Account createAccount(Account account);

    Account retrieveAccount(String accountId);

    String updateAccount(String accountId, Account account);

    String deleteAccount(String accountId);

    List<Account> getAllAccounts();
}
