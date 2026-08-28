package exercise9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestExercise {

    @Test
    public void firstTestCase(){

        String text = "some text";

        int actual = text.length();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void addTestCase(){

        //Arrange
        Calculator calc = new Calculator(4,3);
        int expected = 7;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);


    }




}
