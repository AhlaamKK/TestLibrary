package com.example.mygoselllibrary.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DebitResponseParser {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("customer")
    @Expose
    private UserResponseParser customer;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("transactions")
    @Expose
    private List<CreditResponseParser> transactions = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserResponseParser getCustomer() {
        return customer;
    }

    public void setCustomer(UserResponseParser customer) {
        this.customer = customer;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public List<CreditResponseParser> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<CreditResponseParser> transactions) {
        this.transactions = transactions;
    }



}







