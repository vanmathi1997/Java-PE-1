import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class IterationTest {
    @Test
    public void givenOneStringShouldReturnIterativeInteger() {
        //Arrange
        Iteration obj = new Iteration();
        //Act
        String sum = obj.finditeration(4);
        //Assert
        assertEquals("1 2 2 3 3 3 4 4 4 4 ", sum);

    }
    @Test(expected = NullPointerException.class)
    public void givenOneStringShouldReturnException() {
        //Arrange
        Iteration obj = new Iteration();
        //Act
        String sum = obj.finditeration( null);

    }

}