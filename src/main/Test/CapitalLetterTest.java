import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalLetterTest {
@Test
public void givenOneCharacterShouldReturnCapitalLetter()
{
    //Arrange
    CapitalLetter obj=new CapitalLetter();

    //Act
    String result=obj.findcapitalletter('A');

    //Assert
    assertEquals("Capital Letter",result);
}
    @Test
    public void givenOneCharacterShouldReturnLowerCaseLetter()
    {
        //Arrange
        CapitalLetter obj=new CapitalLetter();

        //Act
        String result=obj.findcapitalletter('a');

        //Assert
        assertEquals("Lower case letter",result);
    }
    @Test
    public void givenSpecialCharacterShouldReturnSpecialCharacter()
    {
        //Arrange
        CapitalLetter obj=new CapitalLetter();

        //Act
        String result=obj.findcapitalletter('+');

        //Assert
        assertEquals("Some Special Character",result);
    }
    @Test
    public void givenNumberShouldReturnNumericDigit()
    {
        //Arrange
        CapitalLetter obj=new CapitalLetter();

        //Act
        String result=obj.findcapitalletter('6');

        //Assert
        assertEquals("Number Digit",result);
    }

}