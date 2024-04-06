package com.fang.fangincome.controller;

import com.fang.fangincome.domain.DailyReport;
import com.fang.fangincome.service.DailyReportService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/daily-report")
public class IncomeDailyController {

    @Autowired
    private DailyReportService dailyReportService;

    @GetMapping
    public List<DailyReport> listAllIncomeDaily(){
        return dailyReportService.listAllIncomeDaily();
    }

    @PostMapping("/addincome")
    public void saveIncomeDaily(@Valid @RequestBody DailyReport dailyReport) {
        try {
            dailyReportService.saveIncome(dailyReport);
        } catch (Exception e){
            log.error("Error when insert income daily", e.getMessage());
        }
    }

    @GetMapping ("/reportbydate")
    public List<DailyReport> getIncomeByDate(@RequestParam("date") String dateOfReport) throws Exception {
        return dailyReportService.findIncomeByDate(dateOfReport);
    }

    @GetMapping("/findbyid/{id}")
    public DailyReport findIncomeById(@PathVariable String id){
        return dailyReportService.findIncomeById(id);
    }

    @GetMapping("/getbyid/{id}")
    public DailyReport getIncomeById(@PathVariable String id) throws Exception {
        return dailyReportService.getIncomeById(id);
    }
}
