package com.eldorado.bank.Models;

import java.util.Objects;

public class Card_Type {
    private int card_type_id;
    private String card_type;

    @Override
    public String toString() {
        return "{" +
                " card_type_id='" + getCard_type_id() + "'" +
                ", card_type='" + getCard_type() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Card_Type)) {
            return false;
        }
        Card_Type card_Type = (Card_Type) o;
        return card_type_id == card_Type.card_type_id && Objects.equals(card_type, card_Type.card_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card_type_id, card_type);
    }

    public int getCard_type_id() {
        return this.card_type_id;
    }

    public void setCard_type_id(int card_type_id) {
        this.card_type_id = card_type_id;
    }

    public String getCard_type() {
        return this.card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public Card_Type(int card_type_id, String card_type) {
        this.card_type_id = card_type_id;
        this.card_type = card_type;
    }

}
