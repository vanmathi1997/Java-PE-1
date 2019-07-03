import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class AddUnspecifiedInputsTest {
   AddUnspecifiedInputs obj;
    @Before
    public void setUp()
    {
        obj=new AddUnspecifiedInputs();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenOneStringShouldReturnInteger(){
        int sum=obj.findsum("12 23 2 4");
        assertEquals(41,sum);

    }
    @Test(expected = InputMismatchException.class)
    public void givenOneStringShouldReturn(){
        int sum=obj.findsum("12 hi 2 4");

           }
    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNull(){
       int sum=obj.findsum( null);


    }


}
