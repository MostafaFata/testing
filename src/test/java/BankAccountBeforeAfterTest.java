import org.example.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BankAccountBeforeAfterTest {

    static BankAccount bankAccount;

    @BeforeAll
    public static void initiateBankAccount(){
         bankAccount = new BankAccount(0, 0);
        System.out.println("Initiating Bank Account for test.");
    }

    @Test
    public void DepositTest(){
        bankAccount.deposit(500);
        Assertions.assertEquals(500, bankAccount.getBalance());
    }

    @Test
    public void WithdrawTest(){
        bankAccount.withdraw(200);
        Assertions.assertEquals(300, bankAccount.getBalance());
    }

    @AfterAll
    public static void endTest(){
        System.out.println("Test has ended!");
    }



}
