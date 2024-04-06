package com.fang.fangincome.service;

import com.fang.fangincome.domain.DailyReport;

import java.text.ParseException;
import java.util.List;

public interface
DailyReportService {
    List<DailyReport> listAllIncomeDaily();
    void saveIncome(DailyReport dailyReport) throws ParseException;


    List<DailyReport> findIncomeByDate(String reportDate) throws Exception;

    DailyReport findIncomeById(String id);

    DailyReport getIncomeById(String id) throws Exception;
}
