import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TargetnumberTest {
    Targetnumber obj;
    @Before
    public void setUp()
    {
        obj = new Targetnumber();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenTwoNumbersShouldReturnMatched(){

         String result=obj.gettarget(12,12);
        assertEquals("Number guessed matches the original number",result);

    }
    @Test
    public void givenTwoDifferentNumbersShouldReturnLessThanTarget(){
        String result=obj.gettarget(40,23);
        assertEquals("Number guessed is less than the original number",result);

    }
    @Test
    public void givenTwoDifferentNumbersShouldReturnGreaterThanTarget(){
        String result=obj.gettarget(40,45);
        assertEquals("Number guessed is greater than the original number",result);

    }
    @Test
    public void givenZeroShouldReturn(){
        String result=obj.gettarget(0,0);
        assertEquals("Number guessed matches the original number",result);

    }



}