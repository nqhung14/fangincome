package com.fang.fangincome.repository;

import com.fang.fangincome.domain.IncomeDaily;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IncomeDailyRepository extends MongoRepository<IncomeDaily, String> {
}
