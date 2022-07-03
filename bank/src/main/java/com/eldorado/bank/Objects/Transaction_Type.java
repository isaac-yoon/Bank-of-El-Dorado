package com.eldorado.bank.Objects;

import java.util.Objects;

// REMEMBER - The types for accounts are also being referenced from this table
public class Transaction_Type {
    private int id_type;
    private String transaction_type;

    @Override
    public String toString() {
        return "{" +
                " id_type='" + getId_type() + "'" +
                ", transaction_type='" + getTransaction_type() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction_Type)) {
            return false;
        }
        Transaction_Type transaction_Type = (Transaction_Type) o;
        return id_type == transaction_Type.id_type
                && Objects.equals(transaction_type, transaction_Type.transaction_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_type, transaction_type);
    }

    public int getId_type() {
        return this.id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getTransaction_type() {
        return this.transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public Transaction_Type(int id_type, String transaction_type) {
        this.id_type = id_type;
        this.transaction_type = transaction_type;
    }

}
