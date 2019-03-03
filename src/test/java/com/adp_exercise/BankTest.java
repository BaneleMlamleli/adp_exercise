package com.adp_exercise;

import com.adp_exercise.config.AppConfig;
import com.adp_exercise.service.BankService;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest {
    private BankService bankService;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        bankService = (BankService)ctx.getBean("bank");
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
    @Test
    public void creditAccount() throws Exception {
        Assert.assertTrue("10000.0",bankService.creditAccount(1500) == 10000.0);
    }

    @Test
    public void debitAccount() throws Exception {
        Assert.assertTrue("8250",bankService.debitAccount(250) == 8250);
    }
}
