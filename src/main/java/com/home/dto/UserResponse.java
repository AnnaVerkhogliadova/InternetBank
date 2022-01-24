package com.home.dto;

public class UserResponse {
   private final int id;
   private final int balance;

    public UserResponse(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }
}
