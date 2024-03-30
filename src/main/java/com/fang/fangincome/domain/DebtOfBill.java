package com.fang.fangincome.domain;

import lombok.Data;

@Data
public class DebtOfBill {
    private String billId;

    private int amountOwedOfBill;
    private String debtor;
}
