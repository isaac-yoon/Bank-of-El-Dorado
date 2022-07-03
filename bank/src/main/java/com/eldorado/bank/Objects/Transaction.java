package com.eldorado.bank.Objects;

import java.util.Objects;

public class Transaction {
    private int transaction_id, account_id, transaction_type, card_type;
    private double amount;

    @Override
    public String toString() {
        return "{" +
                " transaction_id='" + getTransaction_id() + "'" +
                ", account_id='" + getAccount_id() + "'" +
                ", transaction_type='" + getTransaction_type() + "'" +
                ", card_type='" + getCard_type() + "'" +
                ", amount='" + getAmount() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction)) {
            return false;
        }
        Transaction transactions = (Transaction) o;
        return transaction_id == transactions.transaction_id && account_id == transactions.account_id
                && transaction_type == transactions.transaction_type && card_type == transactions.card_type
                && amount == transactions.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction_id, account_id, transaction_type, card_type, amount);
    }

    public int getTransaction_id() {
        return this.transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getAccount_id() {
        return this.account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getTransaction_type() {
        return this.transaction_type;
    }

    public void setTransaction_type(int transaction_type) {
        this.transaction_type = transaction_type;
    }

    public int getCard_type() {
        return this.card_type;
    }

    public void setCard_type(int card_type) {
        this.card_type = card_type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction(int transaction_id, int account_id, int transaction_type, int card_type, double amount) {
        this.transaction_id = transaction_id;
        this.account_id = account_id;
        this.transaction_type = transaction_type;
        this.card_type = card_type;
        this.amount = amount;
    }
}