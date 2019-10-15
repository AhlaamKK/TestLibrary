package com.example.mygoselllibrary.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponseParser {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("customer")
    @Expose
    private Customer customer;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("transactions")
    @Expose
    private List<Object> transactions = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
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

    public List<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Object> transactions) {
        this.transactions = transactions;
    }

    public class Customer {

        @SerializedName("name")
        @Expose
        private Name name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("phone")
        @Expose
        private Phone phone;

        public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Phone getPhone() {
            return phone;
        }

        public void setPhone(Phone phone) {
            this.phone = phone;
        }

    }

    public class Name {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("first")
        @Expose
        private String first;
        @SerializedName("last")
        @Expose
        private String last;
        @SerializedName("display")
        @Expose
        private String display;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getDisplay() {
            return display;
        }

        public void setDisplay(String display) {
            this.display = display;
        }

    }

    public class Phone {

        @SerializedName("country_code")
        @Expose
        private String countryCode;
        @SerializedName("number")
        @Expose
        private String number;

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

    }
}