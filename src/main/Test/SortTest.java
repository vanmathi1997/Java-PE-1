import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort object;
    @Before
    public void setUp()
    {
       object=new Sort();
    }
    @After
    public void tearDown()
    {
    object=null;
    }
    @Test
    public void givenOneNumberShouldReturnNonIncreasingOrder(){
        String result=object.sort(1234534);
        assertEquals("5443321",result);

    }
    @Test
    public void givenNonIncreasingOrderNumberShouldReturnSumOfEvenDigits(){
        int result=object.add(5443321);
        assertEquals(10,result);

    }
    @Test
    public void givenNonEvenDigitsShouldReturnZero(){
        int result=object.add(10);
        assertEquals(0,result);

    }
}