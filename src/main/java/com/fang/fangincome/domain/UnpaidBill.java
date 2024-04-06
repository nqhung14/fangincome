package com.fang.fangincome.domain;

import lombok.Data;

@Data
public class UnpaidBill {
    String billId;
    int amountOfBill;
    String debtor;
}
