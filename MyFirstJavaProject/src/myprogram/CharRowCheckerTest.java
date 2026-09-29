package myprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharRowCheckerTest {

    @Test

    public void testGetRow(){
        String[] Array =  {"We will","we will","rock you"};
        int arrayRow = Array.length;

        CharRowChecker checker = new CharRowChecker();

        int expected = arrayRow;
        int actual = checker.getRow(Array);

        assertEquals(expected,actual);

    }


    @Test

    public void testGetChar(){
        String[] Array =  {"We will","we will","rock you"};
        int charSum = 22;

        CharRowChecker checker = new CharRowChecker();

        int expected = charSum;
        int actual = checker.getChar(Array);

        assertEquals(expected,actual);

    }

    @Test

    public void testGetCharFromEmptyArray(){
        String[] Array = new String[5];

        CharRowChecker checker = new CharRowChecker();

        int expected = 0;
        int actual = checker.getChar(Array);

        assertEquals(expected,actual);

    }

    @Test

    public void testGetRowFromEmptyArray(){
        String[] Array = new String[5];

        CharRowChecker checker = new CharRowChecker();

        int expected = 0;
        int actual = checker.getRow(Array);

        assertEquals(expected,actual);

    }




}
