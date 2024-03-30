package com.fang.fangincome.controller;

import com.fang.fangincome.repository.IncomeDailyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;

@RestController
public class IncomeDailyController {

    @Autowired
    private IncomeDailyRepository incomeDaily;

}
