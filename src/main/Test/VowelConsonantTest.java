import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    @Test
    public void givenStringShouldReturnVowelOrConsonantorNotAnAlphabet() {
        //Arrange
        VowelConsonant obj = new VowelConsonant();
        //Act
        String result = obj.findvowelconsonant("a@");
        //Assert
        assertEquals(" Vowel Not an alphabet", result);

    }
    @Test
    public void givenStringShouldReturnVowelOrConsonant() {
        //Arrange
        VowelConsonant obj = new VowelConsonant();
        //Act
        String result = obj.findvowelconsonant("ab");
        //Assert
        assertEquals(" Vowel Consonant", result);

    }
    @Test
    public void givenNullShouldReturnNull() {
        //Arrange
        VowelConsonant obj = new VowelConsonant();
        //Act
        String result = obj.findvowelconsonant(null);
        //Assert
        assertEquals(null, result);

    }


}