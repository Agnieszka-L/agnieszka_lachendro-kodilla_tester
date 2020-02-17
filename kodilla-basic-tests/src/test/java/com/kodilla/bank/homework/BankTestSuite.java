package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {

    @Test
    public void getBalance() {

        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{200}),
                new CashMachine(new int[]{-100}),
                new CashMachine(new int[]{200, -200}),
        };
        Bank bank = new Bank(cashMachines);
        assertEquals(100, bank.getBalance());
    }

    @Test
    public void getBalanceWithOnlyOneCashMachineTransaction() {

        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{200}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
        };
        Bank bank = new Bank(cashMachines);
        assertEquals(200, bank.getBalance());
    }

    @Test
    public void getBalanceWithNoTransactions() {

        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
        };
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getBalance());
    }

//    @Test
//    public void getBalance2() {
//
//        Bank bank = new Bank(new CashMachine[]{
//                new CashMachine(new int[]{200, 300, -100, -200}),
//                new CashMachine(new int[]{100, 200, -300, -200}),
//                new CashMachine(new int[]{-200, 500}),
//        });
//    }

    @Test
    public void getWithdrawalCount() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{100, -300}),
                new CashMachine(new int[]{-200, -300}),
                new CashMachine(new int[]{-500})};
        Bank bank = new Bank(cashMachines);
        assertEquals(4, bank.getWithdrawalCount());
    }

    @Test
    public void getWithdrawalCountOnlyWhenWithdrawal() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-100, -300}),
                new CashMachine(new int[]{-200, -300}),
                new CashMachine(new int[]{-500})};
        Bank bank = new Bank(cashMachines);
        assertEquals(5, bank.getWithdrawalCount());
    }

    @Test
    public void getWithdrawalCountNoWithdrawal() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{100, 300}),
                new CashMachine(new int[]{200, 300}),
                new CashMachine(new int[]{500})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getWithdrawalCount());
    }

    @Test
    public void getWithdrawalCountWithNoTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getWithdrawalCount());
    }

    @Test
    public void getWithdrawalCountWithOneTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-100}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(1, bank.getWithdrawalCount());
    }

    @Test
    public void getDepositCount() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-100, -300}),
                new CashMachine(new int[]{200, -300}),
                new CashMachine(new int[]{500})};
        Bank bank = new Bank(cashMachines);
        assertEquals(2, bank.getDepositCount());
    }

    @Test
    public void getDepositCountWithNoDeposits() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-100, -300}),
                new CashMachine(new int[]{-200, -300}),
                new CashMachine(new int[]{-500})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getDepositCount());
    }

    @Test
    public void getDepositCountWithOnlyDeposits() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{100, 300}),
                new CashMachine(new int[]{200, 300}),
                new CashMachine(new int[]{500})};
        Bank bank = new Bank(cashMachines);
        assertEquals(5, bank.getDepositCount());
    }

    @Test
    public void getDepositCountWithNoTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getDepositCount());
    }

    @Test
    public void getDepositCountWithOnlyOneDeposit() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(1, bank.getDepositCount());
    }

    @Test
    public void getWithdrawalAmount() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(-300, bank.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithoutTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithOnlyDepositsTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{200}),
                new CashMachine(new int[]{100}),
                new CashMachine(new int[]{200, 100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithOnlyWithdrawalTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100}),
                new CashMachine(new int[]{-200, -100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(-600, bank.getWithdrawalAmount());
    }

    @Test
    public void getWithdrawalAmountWithOnlyOneTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(-200, bank.getWithdrawalAmount());
    }

    @Test
    public void getDepositAmount() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(300, bank.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithNoTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithOnlyDepositsTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{200}),
                new CashMachine(new int[]{100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(600, bank.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithNoDepositsTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-300}),
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getDepositAmount());
    }

    @Test
    public void getDepositAmountWithOnlyOneDepositsTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(300, bank.getDepositAmount());
    }

    @Test
    public void getAverageWithdrawal() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(-150, bank.getAverageWithdrawal());
    }

    @Test
    public void getAverageWithdrawalWithNoTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageWithdrawal());
    }

    @Test
    public void getAverageWithdrawalWithOnlyDepositTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{200}),
                new CashMachine(new int[]{100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageWithdrawal());
    }

    @Test
    public void getAverageWithdrawalWithOnlyOneDepositTransaction() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageWithdrawal());
    }

    @Test
    public void getAverageWithdrawalWithOnlyOneWithdrawalTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-300}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(-300, bank.getAverageWithdrawal());
    }

    @Test
    public void getAverageDeposits() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300}),
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(300, bank.getAverageDeposits());
    }

    @Test
    public void getAverageDepositsWithOnlyWithdrawalTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-300}),
                new CashMachine(new int[]{-200}),
                new CashMachine(new int[]{-100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageDeposits());
    }

    @Test
    public void getAverageDepositsWithONoTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageDeposits());
    }

    @Test
    public void getAverageDepositsWithOnlyDepositTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{300, 100, 100}),
                new CashMachine(new int[]{200}),
                new CashMachine(new int[]{100})};
        Bank bank = new Bank(cashMachines);
        assertEquals(160, bank.getAverageDeposits());
    }

    @Test
    public void getAverageDepositsWithOnlyOneDepositTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{100}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(100, bank.getAverageDeposits());
    }

    @Test
    public void getAverageDepositsWithOnlyOneWithdrawalTransactions() {
        CashMachine[] cashMachines = new CashMachine[]{
                new CashMachine(new int[]{-100}),
                new CashMachine(new int[]{}),
                new CashMachine(new int[]{})};
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageDeposits());
    }
}