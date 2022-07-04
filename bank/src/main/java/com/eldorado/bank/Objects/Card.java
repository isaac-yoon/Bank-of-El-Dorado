package com.eldorado.bank.Objects;

import java.sql.Date;
import java.util.Objects;

public class Card {
    private int card_id, account_id, card_number, card_type, security_number;
    private boolean enabled;
    private Date expiration_date;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;
        return card_id == card.card_id && account_id == card.account_id && card_number == card.card_number
                && card_type == card.card_type && security_number == card.security_number && enabled == card.enabled
                && Objects.equals(expiration_date, card.expiration_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card_id, account_id, card_number, card_type, security_number, enabled, expiration_date);
    }

    public int getCard_id() {
        return this.card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public int getAccount_id() {
        return this.account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getCard_number() {
        return this.card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public int getCard_type() {
        return this.card_type;
    }

    public void setCard_type(int card_type) {
        this.card_type = card_type;
    }

    public int getSecurity_number() {
        return this.security_number;
    }

    public void setSecurity_number(int security_number) {
        this.security_number = security_number;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getExpiration_date() {
        return this.expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public Card(int card_id, int account_id, int card_number, int card_type, int security_number, boolean enabled,
            Date expiration_date) {
        this.card_id = card_id;
        this.account_id = account_id;
        this.card_number = card_number;
        this.card_type = card_type;
        this.security_number = security_number;
        this.enabled = enabled;
        this.expiration_date = expiration_date;
    }

    @Override
    public String toString() {
        return "{" +
                " card_id='" + getCard_id() + "'" +
                ", account_id='" + getAccount_id() + "'" +
                ", card_number='" + getCard_number() + "'" +
                ", card_type='" + getCard_type() + "'" +
                ", security_number='" + getSecurity_number() + "'" +
                ", enabled='" + isEnabled() + "'" +
                ", expiration_date='" + getExpiration_date() + "'" +
                "}";
    }

}
