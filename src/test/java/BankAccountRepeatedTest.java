import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class BankAccountRepeatedTest {

    @RepeatedTest(5)
    public void depositRepeatedTest(){

        BankAccount bankAccount = new BankAccount(0, 0);
        bankAccount.deposit(500);
        Assertions.assertEquals(500, bankAccount.getBalance());

    }

}
