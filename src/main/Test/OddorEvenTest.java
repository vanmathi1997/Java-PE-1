import org.junit.Test;

import static org.junit.Assert.*;

public class OddorEvenTest {
    @Test
    public void givenEvenNumberShouldReturnJerry() {
        //Arrange
        OddorEven obj = new OddorEven();
        //Act
        String result = obj.findoddoreven(24);
        //Assert
        assertEquals("Jerry", result);

    }
    @Test
    public void givenOddNumberShouldReturnTom() {
        //Arrange
        OddorEven obj = new OddorEven();
        //Act
        String result = obj.findoddoreven(23);
        //Assert
        assertEquals("Tom", result);

    }
    @Test
    public void givenNumberShouldReturnMessage() {
        //Arrange
        OddorEven obj = new OddorEven();
        //Act
        String result = obj.findoddoreven(2);
        //Assert
        assertEquals("Number is not between 20 and 30", result);

    }
}