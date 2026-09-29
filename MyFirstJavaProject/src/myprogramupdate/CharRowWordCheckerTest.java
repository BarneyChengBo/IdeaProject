package myprogramupdate;

import myprogram.CharRowChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharRowWordCheckerTest {

    @Test

    public void testGetWordAmount(){
         String[] Array =  {"We will","we will","rock you"};
         int wordAmount = 6;

         CharRowWordChecker checker = new CharRowWordChecker();

         int expected = wordAmount;
         int actual = checker.getWord(Array);

         assertEquals(expected,actual);

     }

    @Test

    public void testGetLongetWord(){
        String[] Array =  {"We have","run so many","experiments"};
        String wordLongest = "experiments";

        CharRowWordChecker checker = new CharRowWordChecker();

        String expected = wordLongest;
        String actual = checker.getLongestWord(Array);

        assertEquals(expected,actual);

    }

    @Test

    public void testDetectStop(){
        String[] Array =  {"stop","run so many","experiments"};
        boolean output = false;

        CharRowWordChecker checker = new CharRowWordChecker();

        boolean expected = output;
        boolean actual = checker.detectStop(Array);

        assertEquals(expected,actual);

    }





}
