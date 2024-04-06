package com.fang.fangincome.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SpentDaily {
    @NotNull
    String itemSpent;
    @NotNull
    int amountOfMoney;
}
