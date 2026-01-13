package com.test.unit_testing;
public class BankService {
public void withdraw(int balance) throws InvalidBalanceException {
if (balance < 500) {
throw new InvalidBalanceException("Low Balance");
}
}
}
