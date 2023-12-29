import jdk.jfr.Enabled;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class OsJreTest {

    @Test
    @EnabledOnOs(OS.MAC)
    public void testOnMac(){
        System.out.println("I am on a Mac");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testOnWindows(){
        System.out.println("I am on a Win");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    public void testOnJRE(){}

    @Test
    @Disabled("Temporarily Disabled Test")
    public void disabledTest(){}



}
