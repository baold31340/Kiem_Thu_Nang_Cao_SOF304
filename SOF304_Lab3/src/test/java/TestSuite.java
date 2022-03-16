import org.junit.runner.RunWith;
import org.junit.runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses(

{ ErrorCollectorExampleTest.class, PersonTest.class, JUnitMessageTest.class })
public class TestSuite { // nothing
}