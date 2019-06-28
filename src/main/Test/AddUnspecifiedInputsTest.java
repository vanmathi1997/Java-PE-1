import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class AddUnspecifiedInputsTest {
    @Test
    public void givenOneStringShouldReturnInteger(){
        //Arrange
        AddUnspecifiedInputs obj=new AddUnspecifiedInputs();
        //Act
        int sum=obj.findsum("12 23 2 4");
        //Assert
        assertEquals(41,sum);

    }
    @Test(expected = InputMismatchException.class)
    public void givenOneStringShouldReturn(){
        //Arrange
        AddUnspecifiedInputs obj=new AddUnspecifiedInputs();
        //Act
        int sum=obj.findsum("12 hi 2 4");

           }
    @Test
    public void givenNullShouldReturnNull(){
        //Arrange
        AddUnspecifiedInputs obj=new AddUnspecifiedInputs();
        //Act
        int sum=obj.findsum( "");
        //Assert
        assertEquals(0,sum);

    }


}
