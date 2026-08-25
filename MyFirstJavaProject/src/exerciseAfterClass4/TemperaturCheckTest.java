package exerciseAfterClass4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TemperaturCheckTest {
    @Test
    public void testLowTempCheck(){
        TemperaturChecker tempCheck = new TemperaturChecker();

        String expected = "För kallt";
        String actual = tempCheck.checkTemperature(15);

        assertEquals(expected,actual);

    }

    @Test
    public void testHighTempCheck(){
        TemperaturChecker tempCheck = new TemperaturChecker();

        String expected = "För varmt";
        String actual = tempCheck.checkTemperature(28);

        assertEquals(expected,actual);
    }

    @Test
    public void testComfortableTempCheck() {
        TemperaturChecker tempCheck = new TemperaturChecker();

        String expected = "Lagom temp";
        String actual = tempCheck.checkTemperature(22);

        assertEquals(expected,actual);


    }







}