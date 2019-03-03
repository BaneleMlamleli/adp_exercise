package com.adp_exercise.service.Implementation;

import com.adp_exercise.service.BankService;

public class Bank implements BankService {

    private double initialAmount = 8500;

    @Override
    public double creditAccount(double creditAmount) {
        return initialAmount + creditAmount;
    }

    @Override
    public double debitAccount(double debitAmount) {
        return initialAmount - debitAmount;
    }
}
