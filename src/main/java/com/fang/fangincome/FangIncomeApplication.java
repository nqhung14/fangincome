package com.fang.fangincome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FangIncomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FangIncomeApplication.class, args);
	}

}
