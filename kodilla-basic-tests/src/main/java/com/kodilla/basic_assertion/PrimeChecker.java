package com.kodilla.basic_assertion;

public class PrimeChecker {

    public PrimeChecker() {
        System.out.println("PrimeChecker constructor");
    }

    public boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}