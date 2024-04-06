package com.fang.fangincome.service;

import com.fang.fangincome.domain.DailyReport;
import com.fang.fangincome.repository.DailyReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class DailyReportServiceImpl implements DailyReportService {
    @Autowired
    DailyReportRepository dailyReportRepository;
    @Override
    public List<DailyReport> listAllIncomeDaily(){
        return dailyReportRepository.findAll();
    }
    @Override
    public void saveIncome(DailyReport dailyReport){
        String id = UUID.randomUUID().toString();
        dailyReport.setId(id);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        dailyReport.setReportDate(strDate);
        int endingCash = dailyReport.getInitialShiftCash() + dailyReport.getEndOfShiftCash();
        dailyReport.setEndingCash(endingCash);
        dailyReportRepository.save(dailyReport);
    }

    @Override
    public List<DailyReport> findIncomeByDate(String reportDate){
        List<DailyReport> listDailyReport = dailyReportRepository.findDailyReportByReportDate(reportDate);
        if (listDailyReport.isEmpty()) {
            System.out.println("There is no record with date: " + reportDate);
            return listDailyReport;
        } else {
            return listDailyReport;
        }
    }

    @Override
    public DailyReport findIncomeById(String id){
        return dailyReportRepository.findDailyReportById(id);
    }
    @Override
    public DailyReport getIncomeById (String id) throws Exception {
        Optional<DailyReport> IncomeDaily = dailyReportRepository.findById(id);
        if (IncomeDaily.isPresent()){
            return IncomeDaily.get();
        }else {
            throw new Exception("Can't not find record with ID: " + id);
        }
    }
}
