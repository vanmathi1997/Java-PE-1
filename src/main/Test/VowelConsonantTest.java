import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant obj;
    @Before
    public void setUp()
    {
        obj = new VowelConsonant();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenStringShouldReturnVowelOrConsonantorNotAnAlphabet() {
        String result = obj.findvowelconsonant("a@");
        assertEquals(" Vowel Not an alphabet", result);

    }
    @Test
    public void givenStringShouldReturnVowelOrConsonant() {
        String result = obj.findvowelconsonant("ab");
        assertEquals(" Vowel Consonant", result);

    }
    @Test
    public void givenNullShouldReturnNull() {
        String result = obj.findvowelconsonant(null);
        assertEquals(null, result);

    }


}