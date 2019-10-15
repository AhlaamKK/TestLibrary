package com.example.mygoselllibrary.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CreditResponseParser {

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
    private List<Transaction> transactions = null;

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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }


    public class Receipt {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("email")
        @Expose
        private Boolean email;
        @SerializedName("sms")
        @Expose
        private Boolean sms;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getEmail() {
            return email;
        }

        public void setEmail(Boolean email) {
            this.email = email;
        }

        public Boolean getSms() {
            return sms;
        }

        public void setSms(Boolean sms) {
            this.sms = sms;
        }

    }

    public class Source {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private String id;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    public class Transaction {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("currency")
        @Expose
        private String currency;
        @SerializedName("amount")
        @Expose
        private Integer amount;
        @SerializedName("receipt")
        @Expose
        private Receipt receipt;
        @SerializedName("source")
        @Expose
        private Source source;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Receipt getReceipt() {
            return receipt;
        }

        public void setReceipt(Receipt receipt) {
            this.receipt = receipt;
        }

        public Source getSource() {
            return source;
        }

        public void setSource(Source source) {
            this.source = source;
        }

    }

}

