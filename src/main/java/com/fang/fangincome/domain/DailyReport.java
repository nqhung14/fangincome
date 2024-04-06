package com.fang.fangincome.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document("DailyReport")
public class DailyReport {
    String id;
    String reportDate;
    @NotNull
    IncomeDaily incomeDaily;
    @NotNull
    @Valid
    SpentDaily spentDaily;
    @NotNull
    @Valid
    UnpaidBill unpaidBill;
    @NotNull
    int initialShiftCash;
    @NotNull
    int endOfShiftCash;
    int endingCash;
}
