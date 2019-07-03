import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration obj;

    @Before
    public void setUp() {
        obj = new Iteration();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void givenNumberShouldReturnIterativeInteger() {

        String sum = obj.finditeration(4);
        assertEquals("1 2 2 3 3 3 4 4 4 4 ", sum);

    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnException() {

        String sum = obj.finditeration(null);

    }

    @Test
    public void givenZeroShouldReturnEmptyString() {

        String sum = obj.finditeration(0);
        assertEquals("", sum);


    }
}