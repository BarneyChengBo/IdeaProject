package exerciseAfterClass1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestEvenChecker {

    @Test

    public void testEvenChecker() {

        EvenChecker evenCheck = new EvenChecker();

        boolean expected = true;

        boolean actual = evenCheck.checkEven(26);

        assertEquals(expected, actual);

        System.out.println("测试结果: " + actual);


    }

}