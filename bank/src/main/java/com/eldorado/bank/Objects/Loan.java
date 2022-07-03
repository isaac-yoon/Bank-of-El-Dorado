package com.eldorado.bank.Objects;

import java.util.Objects;

public class Loan {
    private int loan_id, account_id;
    private double amount, interest_rate, owed_per_month;
    private boolean past_due;

    @Override
    public String toString() {
        return "{" +
                " loan_id='" + getLoan_id() + "'" +
                ", account_id='" + getAccount_id() + "'" +
                ", amount='" + getAmount() + "'" +
                ", interest_rate='" + getInterest_rate() + "'" +
                ", owed_per_month='" + getOwed_per_month() + "'" +
                ", past_due='" + isPast_due() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Loan)) {
            return false;
        }
        Loan loan = (Loan) o;
        return loan_id == loan.loan_id && account_id == loan.account_id && amount == loan.amount
                && interest_rate == loan.interest_rate && owed_per_month == loan.owed_per_month
                && past_due == loan.past_due;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loan_id, account_id, amount, interest_rate, owed_per_month, past_due);
    }

    public int getLoan_id() {
        return this.loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    public int getAccount_id() {
        return this.account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest_rate() {
        return this.interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getOwed_per_month() {
        return this.owed_per_month;
    }

    public void setOwed_per_month(double owed_per_month) {
        this.owed_per_month = owed_per_month;
    }

    public boolean isPast_due() {
        return this.past_due;
    }

    public boolean getPast_due() {
        return this.past_due;
    }

    public void setPast_due(boolean past_due) {
        this.past_due = past_due;
    }

    public Loan(int loan_id, int account_id, double amount, double interest_rate, double owed_per_month,
            boolean past_due) {
        this.loan_id = loan_id;
        this.account_id = account_id;
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.owed_per_month = owed_per_month;
        this.past_due = past_due;
    }
}