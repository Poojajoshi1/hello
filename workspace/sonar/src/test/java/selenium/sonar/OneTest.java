package selenium.sonar;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OneTest {
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    testHelloWorld test= new testHelloWorld();
    test.testDoNothing();
    assertEquals("foo", one.foo());
  }

  @Test
  public void testBoth() throws Exception {
    One one = new One();
    assertEquals("toto", one.toto());
    assertEquals("foo", one.foo());
  }
}