import org.junit.*;

import static org.junit.Assert.*;

public class OddorEvenTest {
    OddorEven obj;
    @Before
    public void setUp()
    {
        obj = new OddorEven();
    }
    @After

        public void tearDown()
        {
           obj=null;
        }

    @Test
    public void givenEvenNumberShouldReturnJerry() {
       String result = obj.findoddoreven(24);
       assertEquals("Jerry", result);

    }
    @Test
    public void givenOddNumberShouldReturnTom() {
        String result = obj.findoddoreven(23);
        assertEquals("Tom", result);

    }
    @Test
    public void givenNumberShouldReturnMessage() {

        String result = obj.findoddoreven(19);
        assertEquals("Number is not between 20 and 30", result);

    }
    @Test
    public void givenBoundaryNumberShouldReturnJerry() {

        String result = obj.findoddoreven(20);
        assertEquals("Jerry", result);

    }

}