import org.example.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    static Calculator calculator;
    @BeforeAll
    public static void startingTest(){
        calculator = new Calculator(0, 0);
        System.out.println("The test has started!");
    }

    @Nested
    class PlusMinus{
        @Test
        @DisplayName("plusNumbers method")
        public void testingPlusNumbers(){
            Assertions.assertEquals(0, calculator.plusNumbers());
        }
        @Test
        @DisplayName("minusNumbers method")
        public void testingMinusNumbers(){
            Assertions.assertEquals(0, calculator.minusNumbers());
        }
    }

    @Test
    @DisplayName("multiplyNumbers method")
    public void testingMultiplyNumbers(){
        Assertions.assertEquals(0, calculator.multiplyNumbers());

    }

    @DisplayName("divideNumbers method")
    public void testingDivideNumbers(){
        Assertions.assertThrows(RuntimeException.class, ()-> calculator.divideNumbers() );
    }

    @Test
    public void testAll(){
        Assertions.assertAll(()-> calculator.plusNumbers(), ()-> calculator.minusNumbers(), ()-> calculator.multiplyNumbers());
    }

    @AfterAll
    public static void endingTest(){
        System.out.println("The test has ended!");
    }



}
