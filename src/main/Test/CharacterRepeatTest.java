import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterRepeatTest {
    CharacterRepeat object;
    @Before
    public void setUp()
    {
        object=new CharacterRepeat();
    }
    @After
    public void tearDown()
    {
        object=null;
    }

@Test
    public void givenOneStringShouldReturnStringCharacterRepeat()
{
    String result=object.repeat("hello",2);
    assertEquals("hellololo",result);
}
@Test
    public void givenOneNumberStringShouldReturnStringCharacterRepeat()
    {
        String result=object.repeat("123456",2);
        assertEquals("1234565656",result);
    }
    @Test
            (expected = NullPointerException.class)
    public void givenNullStringShouldReturnNull()
    {
        String result=object.repeat(null,2);
        assertEquals(null,result);
    }
}