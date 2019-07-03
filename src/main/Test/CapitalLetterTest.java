import org.junit.*;

import static org.junit.Assert.*;

public class CapitalLetterTest {
    CapitalLetter obj;
    @Before
    public void setUp()
    {
        obj=new CapitalLetter();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }

    @Test
    public void givenOneCharacterShouldReturnCapitalLetter()
    {
    String result=obj.findcapitalletter('A');
    assertEquals("Capital Letter",result);
    }
    @Test
    public void givenOneCharacterShouldReturnLowerCaseLetter()
    {
        String result=obj.findcapitalletter('a');
        assertEquals("Lower case letter",result);
    }
    @Test
    public void givenSpecialCharacterShouldReturnSpecialCharacter()
    {
        String result=obj.findcapitalletter('+');
        assertEquals("Some Special Character",result);
    }
    @Test
    public void givenNumberShouldReturnNumericDigit()
    {
        String result=obj.findcapitalletter('6');
        assertEquals("Number Digit",result);
    }


}