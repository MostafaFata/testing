import org.example.BankAccount;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderedTest {

    static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @DisplayName("Testing Withdrawal")
    @Order(2)
    public void testWithdraw(){
        bankAccount.withdraw(300);
        Assertions.assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Testing Deposit")
    @Order(1)
    public void testDeposit(){
        bankAccount.deposit(500);
        Assertions.assertEquals(500, bankAccount.getBalance());
    }



}
