package com.home.dto;

public class UserResponse {
   int id;
   int balance;

    public UserResponse(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public UserResponse() {
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }
}
