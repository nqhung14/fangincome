package com.fang.fangincome.repository;

import com.fang.fangincome.domain.DailyReport;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DailyReportRepository extends MongoRepository<DailyReport, String> {
//    List<DailyReport> findDailyReportByReportDate(Date reportDate);

    List<DailyReport> findDailyReportByReportDate(String reportDate);

    DailyReport findDailyReportById(String id);
}
