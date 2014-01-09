package selenium.tp;
import static org.junit.Assert.*;
import org.junit.Test;

public class testHelloWorld {
        @Test
        public void testDoNothing(){
                HelloWorld h = new HelloWorld();
                h.doNothing();
                assertTrue(true);
        }
        
}
