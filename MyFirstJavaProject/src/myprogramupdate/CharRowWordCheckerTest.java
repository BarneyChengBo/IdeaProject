package myprogramupdate;

import myprogram.CharRowChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharRowWordCheckerTest {

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






    @Test

    public void testGetWordAmount(){
         String[] Array =  {"We will","we will","rock you"};
         int wordAmount = 6;

         CharRowWordChecker checker = new CharRowWordChecker();


         int actual = checker.getWord(Array);

         assertEquals(wordAmount,actual);

     }

    @Test

    public void testGetLongestWord(){
        String[] Array =  {"We have","run so many","experiments"};
        String wordLongest = "experiments";

        CharRowWordChecker checker = new CharRowWordChecker();


        String actual = checker.getLongestWord(Array);

        assertEquals(wordLongest,actual);

    }

    @Test

    public void testDetectStop(){
        String[] Array =  {"stop","run so many","experiments"};
        boolean output = false;

        CharRowWordChecker checker = new CharRowWordChecker();


        boolean actual = checker.detectStop(Array);

        assertEquals(output,actual);

    }





}
