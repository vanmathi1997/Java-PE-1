import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class StringreverseTest {
    Stringreverse obj;
    @Before
    public void setUp()
    {
       obj = new Stringreverse();
    }
    @After
    public void tearDown()
    {
obj=null;
    }
    @Test
    public void givenOneStringShouldReturnReversedString() {

        String result = obj.stringreverse("london");
        assertEquals("nodnol", result);

    }
    @Test
    public void givenNumericStringShouldReturnReversedString() {
         String result = obj.stringreverse("12345");
        assertEquals("54321", result);

    }
    @Test
    public void givenNullShouldReturnNull() {
        String result = obj.stringreverse(null);
        assertEquals(null, result);

    }

}