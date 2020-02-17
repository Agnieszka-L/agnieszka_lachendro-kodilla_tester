package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;

    public CashMachine(int[] transactions) {
        this.transactions = transactions;
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            int transaction = transactions[i];
            balance = balance + transaction;
        }
        return balance;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }

    public int getWithdrawalCount() {
        int withdrawalCount = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawalCount++;
            }
        }
        return withdrawalCount;
    }

    public int getDepositCount() {
        int depositCount = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                depositCount++;
            }
        }
        return depositCount;
    }

    public int getWithdrawalAmount() {
        int withdrawalAmount = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawalAmount = withdrawalAmount + transactions[i];
            }
        }
        return withdrawalAmount;
    }

    public int getDepositAmount() {
        int depositAmount = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                depositAmount = depositAmount + transactions[i];
            }
        }
        return depositAmount;
    }
}
