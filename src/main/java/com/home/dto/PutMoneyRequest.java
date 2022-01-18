package com.home.dto;

import javax.validation.constraints.Positive;

public class PutMoneyRequest {

    @Positive
    int putMoney;

    public int getPutMoney() {
        return putMoney;
    }

}
