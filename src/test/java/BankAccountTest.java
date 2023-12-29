import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

@DisplayName("Test BankAccount class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.withdraw(300);
        Assertions.assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(1000, 0);
        bankAccount.deposit(500);
        Assertions.assertEquals(1500, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Withdraw will not be zero")
    public void testWithdrawNotZero(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        Assertions.assertNotEquals(0, bankAccount.getBalance(), "The balance cannot be zero");
    }

    @Test
    @DisplayName("Checking if account is active")
    public void testIsActive(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assertions.assertTrue(bankAccount.getIsActive());
    }

    @Test
    @DisplayName("Testing if Holder Name is not null")
    public void testSetHolderName(){
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setHolderName("Mostafa");
        Assertions.assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Testing if the it throws exception")
    public void testNoWithdrawBelowMinimum(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assertions.assertThrows(RuntimeException.class, ()-> bankAccount.withdraw(2000));
    }

    @Test
    @DisplayName("Withdraw and Deposit with No Exception")
    public void testWithdrawAndDepositWithNoException(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assertions.assertAll(()-> bankAccount.deposit(1000), ()-> bankAccount.withdraw(1200));
    }

    @Test
    @DisplayName("Deposit speed equals to 1 Nano second")
    public void testDepositTimeout(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assertions.assertTimeout(Duration.ofNanos(1), ()-> bankAccount.deposit(200));
    }
    @Test
    @DisplayName("Assumption test")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assumptions.assumeTrue(bankAccount != null, "Account is null");
    }

}
