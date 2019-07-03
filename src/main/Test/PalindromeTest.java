import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Before
    public void setUp()
    {
        obj = new Palindrome();
    }
    @Test
    public void givenPalindromeNumberShouldReturnString() {

        String result = obj.findpalindrome(2468642);
        assertEquals("2468642is a palindrome and the sum of even numbers is greater than 25", result);

    }
    @Test
    public void givenNumberShouldReturnString() {
        String result = obj.findpalindrome(123321);
        assertEquals("123321is a palindrome and the sum of even numbers is less than 25", result);

    }
    @Test
    public void givenNonPalindromeNumberShouldReturnString() {
        String result = obj.findpalindrome(12345);
        assertEquals("12345is not palindrome", result);

    }

}