
package com.test.unit_testing;
import org.junit.Test;
public class BankServiceTest {
@Test(expected = InvalidBalanceException.class)
public void testLowBalance() throws InvalidBalanceException {
BankService bs = new BankService();
bs.withdraw(100);
}
}
