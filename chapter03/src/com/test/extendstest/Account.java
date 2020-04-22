package com.test.extendstest;

public class Account {
    private String account;
    private double balance;

    public String getAccount() {
        return account;
    }

    public Account(String account) {
        this.account = account;
    }

    public Account(double balance) {
        this.balance = balance;
    }
}
