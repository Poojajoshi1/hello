package selenium.sonar;

import static org.junit.Assert.*;

import org.junit.Test;

public class testHelloWorld {
@Test
public void testDoNothing() throws Exception{
HelloWorld h = new HelloWorld();
h.doNothing();
OneTest one = new OneTest();
one.testBoth();
one.testFoo();
assertTrue(true);
}
}
