import org.junit.Test;

import static org.junit.Assert.*;

public class TargetnumberTest {
    @Test
    public void givenTwoNumbersShouldReturnMatched(){
        //Arrange
        Targetnumber object=new Targetnumber();
        //Act
        String result=object.gettarget(12,12);
        //Assert
        assertEquals("Number guessed matches the original number",result);

    }
    @Test
    public void givenTwoDifferentNumbersShouldReturnLessThanTarget(){
        //Arrange
        Targetnumber object=new Targetnumber();
        //Act
        String result=object.gettarget(40,23);
        //Assert
        assertEquals("Number guessed is less than the original number",result);

    }
    @Test
    public void givenTwoDifferentNumbersShouldReturnGreaterThanTarget(){
        //Arrange
        Targetnumber object=new Targetnumber();
        //Act
        String result=object.gettarget(40,45);
        //Assert
        assertEquals("Number guessed is greater than the original number",result);

    }



}