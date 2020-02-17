package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            balance = balance + cashMachine.getBalance();
        }
        return balance;
    }

    public int getWithdrawalCount() {
        int withdrawalCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            withdrawalCount = withdrawalCount + cashMachine.getWithdrawalCount();
        }
        return withdrawalCount;
    }

    public int getDepositCount() {
        int depositCount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            depositCount = depositCount + cashMachine.getDepositCount();
        }
        return depositCount;
    }

    public int getWithdrawalAmount() {
        int withdrawalAmount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            withdrawalAmount += cashMachine.getWithdrawalAmount();
        }
        return withdrawalAmount;
    }

    public int getDepositAmount() {
        int depositAmount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            depositAmount += cashMachine.getDepositAmount();
        }
        return depositAmount;
    }

    public int getAverageWithdrawal() {
        int withdrawalCount = getWithdrawalCount();
        if (withdrawalCount == 0) {
            return 0;
        }
        int averageWithdrawal = getWithdrawalAmount() / withdrawalCount;
        return averageWithdrawal;
    }

    public int getAverageDeposits() {
        int depositCount = getDepositCount();
        if (depositCount == 0) {
            return 0;
        }
        int averageDeposit = getDepositAmount() / depositCount;
        return averageDeposit;
    }
}