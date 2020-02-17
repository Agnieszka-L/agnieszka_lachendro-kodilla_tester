package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {

    @Test
    public void getBalance() {
        int[] transactions = {100, -200, 100, 300};
        CashMachine cashMachine = new CashMachine(transactions);
        assertEquals(300, cashMachine.getBalance());
    }

    @Test
    public void getBalanceForWithdrawalsOnly() {
        CashMachine cashMachine = new CashMachine(new int[]{-100, -200, -100, -300});
        assertEquals(-700, cashMachine.getBalance());
    }

    @Test
    public void getBalanceForDepositsOnly() {
        CashMachine cashMachine = new CashMachine(new int[]{100, 200, 100, 300, 200});
        assertEquals(900, cashMachine.getBalance());
    }

    @Test
    public void getBalanceForNoTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void getBalanceForOneTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{300});
        assertEquals(300, cashMachine.getBalance());
    }

    @Test
    public void getNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{100, -200, 100, 300});
        assertEquals(4, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void getWithdrawalCount() {
        CashMachine cashMachine = new CashMachine(new int[]{100, -200, 100, 300});
        assertEquals(1, cashMachine.getWithdrawalCount());
    }

    @Test
    public void getNoWithdrawalCount() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        assertEquals(0, cashMachine.getWithdrawalCount());
    }

    @Test
    public void getOneWithdrawalCount() {
        CashMachine cashMachine = new CashMachine(new int[]{-100});
        assertEquals(1, cashMachine.getWithdrawalCount());
    }

    @Test
    public void getWithdrawalCountWithOnlyDeposits() {
        CashMachine cashMachine = new CashMachine(new int[]{100, 300, 200, 100});
        assertEquals(0, cashMachine.getWithdrawalCount());
    }

    @Test
    public void getWithdrawalCountWithOnlyWithdrawal() {
        CashMachine cashMachine = new CashMachine(new int[]{-100, -300, -200, -100});
        assertEquals(4, cashMachine.getWithdrawalCount());
    }

    @Test
    public void getDepositCount() {
        CashMachine cashMachine = new CashMachine(new int[]{-100, 300, -200, 100});
        assertEquals(2, cashMachine.getDepositCount());
    }

    @Test
    public void getDepositCountWithOnlyWithdrawal() {
        CashMachine cashMachine = new CashMachine(new int[]{-100, -300, -200, -100});
        assertEquals(0, cashMachine.getDepositCount());
    }

    @Test
    public void getDepositCountWithOnlyDeposits() {
        CashMachine cashMachine = new CashMachine(new int[]{100, 300, 300, 100});
        assertEquals(4, cashMachine.getDepositCount());
    }

    @Test
    public void getDepositCountWithNoTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        assertEquals(0, cashMachine.getDepositCount());
    }

    @Test
    public void getDepositCountWithOneTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{-100});
        assertEquals(0, cashMachine.getDepositCount());
    }

    @Test
    public void getWithdrawalAmount() {
        CashMachine cashMachine = new CashMachine(new int[]{100, -300, 300, -100});
        assertEquals(-400, cashMachine.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithNoWithdrawal() {
        CashMachine cashMachine = new CashMachine(new int[]{100, 300, 300, 100});
        assertEquals(0, cashMachine.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithNoTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        assertEquals(0, cashMachine.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithOneTransactions() {
        CashMachine cashMachine = new CashMachine(new int[]{-200});
        assertEquals(-200, cashMachine.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithOnlyWithdrawal() {
        CashMachine cashMachine = new CashMachine(new int[]{-100, -300, -300, -100});
        assertEquals(-800, cashMachine.getWithdrawalAmount());
    }

    @Test
    public void getDepositAmount() {
        CashMachine cashMachine = new CashMachine(new int[]{100, -300, 300, -100});
        assertEquals(400, cashMachine.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithNoDeposit() {
        CashMachine cashMachine = new CashMachine(new int[]{-100, -300, -300, -100});
        assertEquals(0, cashMachine.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithOnlyOneDeposit() {
        CashMachine cashMachine = new CashMachine(new int[]{100});
        assertEquals(100, cashMachine.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithNoTransaction() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        assertEquals(0, cashMachine.getDepositAmount());
    }
}