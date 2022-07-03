package com.eldorado.bank.Objects;

import java.util.Objects;

public class Account {
    private int account_id, user_id, account_type, loyalty_points;
    private double balance;

    public Account(int account_id, int user_id, int account_type, int loyalty_points, double balance) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.account_type = account_type;
        this.loyalty_points = loyalty_points;
        this.balance = balance;
    }

    public int getAccount_id() {
        return this.account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAccount_type() {
        return this.account_type;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }

    public int getLoyalty_points() {
        return this.loyalty_points;
    }

    public void setLoyalty_points(int loyalty_points) {
        this.loyalty_points = loyalty_points;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return account_id == account.account_id && user_id == account.user_id && account_type == account.account_type
                && loyalty_points == account.loyalty_points && balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(account_id, user_id, account_type, loyalty_points, balance);
    }

    @Override
    public String toString() {
        return "{" +
                " account_id='" + getAccount_id() + "'" +
                ", user_id='" + getUser_id() + "'" +
                ", account_type='" + getAccount_type() + "'" +
                ", loyalty_points='" + getLoyalty_points() + "'" +
                ", balance='" + getBalance() + "'" +
                "}";
    }

}