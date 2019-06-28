import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void givenPalindromeNumberShouldReturnString() {
        //Arrange
        Palindrome obj = new Palindrome();
        //Act
        String result = obj.findpalindrome(2468642);
        //Assert
        assertEquals("2468642is a palindrome and the sum of even numbers is greater than 25", result);

    }
    @Test
    public void givenNumberShouldReturnString() {
        //Arrange
        Palindrome obj = new Palindrome();
        //Act
        String result = obj.findpalindrome(123321);
        //Assert
        assertEquals("123321is a palindrome and the sum of even numbers is less than 25", result);

    }
    @Test
    public void givenNonPalindromeNumberShouldReturnString() {
        //Arrange
        Palindrome obj = new Palindrome();
        //Act
        String result = obj.findpalindrome(12345);
        //Assert
        assertEquals("12345is not palindrome", result);

    }

}