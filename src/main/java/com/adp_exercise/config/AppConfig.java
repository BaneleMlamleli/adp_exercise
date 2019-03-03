package com.adp_exercise.config;

import com.adp_exercise.service.BankService;
import com.adp_exercise.service.Implementation.Bank;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name="bank")
    public BankService getImprovedService(){
        return new Bank();
    }
}
