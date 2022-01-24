package com.home.dto;

import javax.validation.constraints.Positive;

public class TakeMoneyRequest {

    @Positive
    int takeMoney;

    public int getTakeMoney() {
        return takeMoney;
    }

}