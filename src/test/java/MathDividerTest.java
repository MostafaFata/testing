import org.example.MathDivider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathDividerTest {
    private MathDivider mathDivider;

    @BeforeEach
    public void initiateTest(){
        mathDivider = new MathDivider();
    }

    @Test
    public void testDivide(){
        Assertions.assertEquals(10, mathDivider.divide(100, 10));
    }


}
