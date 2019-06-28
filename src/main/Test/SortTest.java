import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void givenOneNumberShouldReturnNonIncreasingOrder(){
        //Arrange
    Sort object=new Sort();
        //Act
        String result=object.sort(1234534);
        //Assert
        assertEquals("5443321",result);

    }
    @Test
    public void givenNonIncreasingOrderNumberShouldReturnSumOfEvenDigits(){
        //Arrange
        Sort object=new Sort();
        //Act
        int result=object.add(5443321);
        //Assert
        assertEquals(10,result);

    }
    @Test
    public void givenShouldReturn(){
        //Arrange
        Sort object=new Sort();
        //Act
        int result=object.add(10);
        //Assert
        assertEquals(0,result);

    }



}