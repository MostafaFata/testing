import org.example.HelloWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test // Annotation
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();

        Assertions.assertEquals("Hello World!", helloWorld.sayHello());

    }

}
