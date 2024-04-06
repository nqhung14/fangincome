package com.fang.fangincome.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
public class IncomeDaily {
    int totalMoneyInPos;
    int moneyByCard;
    int moneyTransferByBank;
    int moneyByPos;
}
