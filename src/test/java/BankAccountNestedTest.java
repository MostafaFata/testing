import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BankAccountNestedTest {

    @Test
    @DisplayName("Testing Deposit")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(0, 0);
        bankAccount.deposit(500);
        Assertions.assertEquals(500, bankAccount.getBalance());
    }


    @Nested
    class WithdrawMinimum{
        @Test
        @DisplayName("Test Equal Zero")
        public void testEqualZero(){
            BankAccount bankAccount = new BankAccount(500, -1000);
            Assertions.assertThrows(RuntimeException.class, ()-> bankAccount.withdraw(500));
        }

        @Test
        @DisplayName("Test Nagative Balance")
        public void testNegative(){
            BankAccount bankAccount = new BankAccount(500, -1000);
            Assertions.assertEquals(-500, bankAccount.withdraw(1000));
        }

    }


}
