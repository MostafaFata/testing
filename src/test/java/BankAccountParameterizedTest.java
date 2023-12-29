import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class BankAccountParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300, 400, 500})
    @Test
    @DisplayName("Multiple Depositing")
    public void depositMultipleWithParameter(int amount){
        BankAccount bankAccount = new BankAccount(0, 0);
        bankAccount.deposit(amount);
        Assertions.assertEquals(amount, bankAccount.getBalance());
    }

}
