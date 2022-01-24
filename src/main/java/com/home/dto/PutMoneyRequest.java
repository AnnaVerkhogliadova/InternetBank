package com.home.dto;

import javax.validation.constraints.Positive;

public class PutMoneyRequest {

    @Positive
    private int putMoney;

    public int getPutMoney() {
        return putMoney;
    }

}
