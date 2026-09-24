package exerciseInClassTDD1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test

    public void testUser(){

        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";


        User userA = new User(userName,passWord);


    }

    @Test

    public void testGetUserName(){
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";


        User userA = new User(userName,passWord);

        String actual = userA.getUserName();

        assertEquals("staffanPaffan", actual);
        assertEquals(userName, actual);

    };

    @Test

    public void testGetPassword() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";


        User userA = new User(userName,passWord);

        String actual = userA.getPassword();
        assertEquals(passWord, actual);

    }


    @Test

    public void testSetUserName() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newUserName = "Paffan";


        User userA = new User(userName,passWord);
        userA.setUserName(newUserName);
        String actual = userA.getUserName();
        assertEquals("Paffan", actual);


    }

    @Test

    public void testSetShortUserName() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newUserName = "lok";


        User userA = new User(userName,passWord);
        userA.setUserName(newUserName);
        String actual = userA.getUserName();
        assertEquals("staffanPaffan", actual);


    }

    @Test

    public void testSetRightPassword() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newPassword = "lok2026";


        User userA = new User(userName,passWord);
        userA.setPassword(newPassword);
        String actual = userA.getPassword();
        assertEquals(newPassword, actual);

    }


    @Test

    public void testSetPasswordLessThan7() {
        String userName = "staffanPaffan";
        String passWord = "solemio";
        String newPassword = "tangon";


        User userA = new User(userName,passWord);
        userA.setPassword(newPassword);
        String actual = userA.getPassword();
        assertEquals("solemio", actual);

    }

    @Test

    public void testSetPasswordEqualTo7() {
        String userName = "staffanPaffan";
        String passWord = "solemio";
        String newPassword = "kokosen";


        User userA = new User(userName,passWord);
        userA.setPassword(newPassword);
        String actual = userA.getPassword();
        assertEquals("kokosen", actual);

    }

    @Test

    public void testSetPasswordEqualTo20() {
        String userName = "staffanPaffan";
        String passWord = "solemio";
        String newPassword = "hejarhejarhejarhejar";


        User userA = new User(userName,passWord);
        userA.setPassword(newPassword);
        String actual = userA.getPassword();
        assertEquals("hejarhejarhejarhejar", actual);

    }

    @Test

    public void testSetPasswordMoreThan20() {
        String userName = "staffanPaffan";
        String passWord = "solemio";
        String newPassword = "hejarhejarhejarhejare";


        User userA = new User(userName,passWord);
        userA.setPassword(newPassword);
        String actual = userA.getPassword();
        assertEquals("solemio", actual);

    }

    @Test

    public void testGetTypeOfUser() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Hämta typeOfUser
        String expected = "normal";
        String actual = user.getTypeOfUser();

        //Kontrollera att typeOfUser är korrekt
        assertEquals(expected, actual);
    }

    @Test

    public void testSetTypeOfUserAdmin() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newUserType = "admin";


        User userA = new User(userName,passWord);


        userA.SetTypeOfUser(newUserType);
        String actual = userA.getTypeOfUser();
        assertEquals(newUserType, actual);

    }

    @Test

    public void testSetTypeOfUserSuper() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newUserType = "super";


        User userA = new User(userName,passWord);


        userA.SetTypeOfUser(newUserType);
        String actual = userA.getTypeOfUser();
        assertEquals(newUserType, actual);

    }

    @Test

    public void testSetTypeOfUserAdminNormal() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newUserType = "admin";
        String newUserType2 = "normal";



        User userA = new User(userName,passWord);


        userA.SetTypeOfUser(newUserType);

        userA.SetTypeOfUser(newUserType2);

        String actual = userA.getTypeOfUser();
        assertEquals(newUserType2, actual);

    }

    @Test

    public void testSetTypeOfUserRadom() {
        String userName = "staffanPaffan";
        String passWord = "St@ffan2026";
        String newUserType = "Rando";


        User userA = new User(userName,passWord);


        userA.SetTypeOfUser(newUserType);
        String actual = userA.getTypeOfUser();
        assertEquals("normal", actual);

    }







}
