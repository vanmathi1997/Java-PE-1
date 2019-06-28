import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterRepeatTest {
@Test
    public void givenOneStringShouldReturnStringCharacterRepeat()
{
    CharacterRepeat object=new CharacterRepeat();
    String result=object.repeat("hello",2);
    assertEquals("hellololo",result);
}
@Test
    public void givenOneNumberStringShouldReturnStringCharacterRepeat()
    {
        CharacterRepeat object=new CharacterRepeat();
        String result=object.repeat("123456",2);
        assertEquals("1234565656",result);
    }
    @Test
            (expected = NullPointerException.class)
    public void givenNullStringShouldReturnNull()
    {
        CharacterRepeat object=new CharacterRepeat();
        String result=object.repeat(null,2);
        assertEquals(null,result);
    }
}