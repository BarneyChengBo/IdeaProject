package exercise10;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test

    public void testCorrectPassword() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;


        //Act
        boolean actual =  pass.check("passw@ord1");

        //Assert
        assertEquals(expected, actual);

    }

    

    @Test

    public void testLessThan8Char() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;


        //Act
        boolean actual =  pass.check("pass1");

        //Assert
        assertEquals(expected, actual);

    }



    @Test

    public void testLessThan8CharNoDigit() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;


        //Act
        boolean actual =  pass.check("pass");

        //Assert
        assertEquals(expected, actual);

    }


    @Test

    public void testNoDigit() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;


        //Act
        boolean actual =  pass.check("pass#word");

        //Assert
        assertEquals(expected, actual);

    }


    @Test

    public void testNoSpecialChar() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;


        //Act
        boolean actual =  pass.check("passw4ord");

        //Assert
        assertEquals(expected, actual);

    }




}
