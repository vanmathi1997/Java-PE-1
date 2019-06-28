import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class StringreverseTest {
    @Test
    public void givenOneStringShouldReturnReversedString() {
        //Arrange
        Stringreverse obj = new Stringreverse();
        //Act
        String result = obj.stringreverse("london");
        //Assert
        assertEquals("nodnol", result);

    }
    @Test
    public void givenNumericStringShouldReturnReversedString() {
        //Arrange
        Stringreverse obj = new Stringreverse();
        //Act
        String result = obj.stringreverse("12345");
        //Assert
        assertEquals("54321", result);

    }
    @Test
    public void givenNullShouldReturnNull() {
        //Arrange
        Stringreverse obj = new Stringreverse();
        //Act
        String result = obj.stringreverse(null);
        //Assert
        assertEquals(null, result);

    }

}