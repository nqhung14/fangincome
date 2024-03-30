package com.fang.fangincome.domain;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document
public class IncomeDaily {

    @Id
    private String Id;
    Date createdDate;
    int initialShiftCash;
    int totalCashByPos;
    int cashByCard;
    int cashTransferByBank;
    int cashByPos;
    int cashFlowOfTheDay;
    DebtOfBill debtOfBill;

    public IncomeDaily(String id, Date createdDate, int initialShiftCash, int totalCashByPos, int cashByCard, int cashTransferByBank, int cashByPos, int cashFlowOfTheDay, DebtOfBill debtOfBill) {
        Id = id;
        this.createdDate = createdDate;
        this.initialShiftCash = initialShiftCash;
        this.totalCashByPos = totalCashByPos;
        this.cashByCard = cashByCard;
        this.cashTransferByBank = cashTransferByBank;
        this.cashByPos = cashByPos;
        this.cashFlowOfTheDay = cashFlowOfTheDay;
        this.debtOfBill = debtOfBill;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getInitialShiftCash() {
        return initialShiftCash;
    }

    public void setInitialShiftCash(int initialShiftCash) {
        this.initialShiftCash = initialShiftCash;
    }

    public int getTotalCashByPos() {
        return totalCashByPos;
    }

    public void setTotalCashByPos(int totalCashByPos) {
        this.totalCashByPos = totalCashByPos;
    }

    public int getCashByCard() {
        return cashByCard;
    }

    public void setCashByCard(int cashByCard) {
        this.cashByCard = cashByCard;
    }

    public int getCashTransferByBank() {
        return cashTransferByBank;
    }

    public void setCashTransferByBank(int cashTransferByBank) {
        this.cashTransferByBank = cashTransferByBank;
    }

    public int getCashByPos() {
        return cashByPos;
    }

    public void setCashByPos(int cashByPos) {
        this.cashByPos = cashByPos;
    }

    public int getCashFlowOfTheDay() {
        return cashFlowOfTheDay;
    }

    public void setCashFlowOfTheDay(int cashFlowOfTheDay) {
        this.cashFlowOfTheDay = cashFlowOfTheDay;
    }

    public DebtOfBill getDebtOfBill() {
        return debtOfBill;
    }

    public void setDebtOfBill(DebtOfBill debtOfBill) {
        this.debtOfBill = debtOfBill;
    }
}
