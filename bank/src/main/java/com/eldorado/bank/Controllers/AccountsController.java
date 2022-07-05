package com.eldorado.bank.Controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eldorado.bank.Models.Account;
import com.eldorado.bank.Models.Card;
import com.eldorado.bank.Models.Loan;
import com.eldorado.bank.Models.Transaction;

@RestController("www.eldorado.com")
public class AccountsController {

    // get all of user's accounts
    @GetMapping("/{user_id}/accounts")
    public String getAccounts(@PathVariable("user_id") int user_id) {
        // using user_id, access database to get all of user's accounts
        return "User ID: " + user_id + " 's accounts";
    }

    // get a specific account of a user
    @GetMapping("/{user_id}/accounts/{account_id}")
    public String getAccount(@PathVariable Map<String, String> pathVarsMap) {
        int user_id = Integer.parseInt(pathVarsMap.get("user_id"));
        String account_id = pathVarsMap.get("account_id");
        return "USER ID: " + user_id + " 's account: " + account_id;
    }

    @GetMapping("/{user_id}/accounts/{account_id}/balance")
    public double getBalance(@PathVariable Map<String, String> pathVarsMap) {
        int user_id = Integer.parseInt(pathVarsMap.get("user_id"));
        String account_id = pathVarsMap.get("account_id");
        
        // for a specific account get balance
        return 100.00;
    }


    @GetMapping("/{user_id}/accounts/{account_id}/loyalty_points")
    public int getLoyaltyPoints(@PathVariable Map<String, String> pathVarsMap) {
        int user_id = Integer.parseInt(pathVarsMap.get("user_id"));
        String account_id = pathVarsMap.get("account_id");
        
        // for a specific account
        // get loyalty points
        return 1000;        
    }

    @GetMapping("/{user_id}/accounts/{account_id}/transactions")
    public ArrayList<Transaction> getTransactions(@PathVariable Map<String, String> pathVarsMap) {
        int user_id = Integer.parseInt(pathVarsMap.get("user_id"));
        String account_id = pathVarsMap.get("account_id");
        
        // for a specific account
        // get transactions
        ArrayList<Transaction> transactions = new ArrayList<>();

        return transactions;        
    }

    @GetMapping("/{user_id}/accounts/{account_id}/cards")
    public ArrayList<Card> getCards(@PathVariable Map<String, String> pathVarsMap) {
        int user_id = Integer.parseInt(pathVarsMap.get("user_id"));
        String account_id = pathVarsMap.get("account_id");
        
        // for a specific account get cards
        ArrayList<Card> cards = new ArrayList<>();

        return cards;        
    }

    @GetMapping("/{user_id}/accounts/{account_id}/loans")
    public ArrayList<Loan> getLoans(@PathVariable Map<String, String> pathVarsMap) {
        int user_id = Integer.parseInt(pathVarsMap.get("user_id"));
        String account_id = pathVarsMap.get("account_id");
        
        // for a specific account get loans
        ArrayList<Loan> loans = new ArrayList<>();

        return loans;        
    }
}
