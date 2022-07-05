package com.eldorado.bank.Daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.eldorado.bank.Models.Account;

public class AccountsDao implements Dao<Account> {
    private List<Account> accounts = new ArrayList<>();

    public AccountsDao() {
        accounts.add(new Account(1, 1, 1, 1000, 100_000.00));
        accounts.add(new Account(2, 2, 2, 0, 100.00));
    }

    @Override
    public Optional<Account> get(int account_id) {
        return Optional.ofNullable(accounts.get(account_id));
    }

    @Override
    public List<Account> getAll() {
        return accounts;
    }

    @Override
    public void save(Account account) {
        accounts.add(account);
    }

    @Override
    public void update(Account account, String[] params) {
        // account.setAccount_id(Objects.requireNonNull(params[0], "accountId cannot be null"));
        // account.setUser_id(Objects.requireNonNull(params[1], "userId cannot be null"));
        // account.setAccount_type(Objects.requireNonNull(params[2], "accountType cannot be null"));
        // account.setLoyalty_points(Objects.requireNonNull(params[3], "loyaltyPoints cannot be null"));
        // account.setBalance(Objects.requireNonNull(params[4], "balance cannot be null"));

        accounts.add(account);
    }

    @Override
    public void delete(Account account) {
        accounts.remove(account);
    }
}
