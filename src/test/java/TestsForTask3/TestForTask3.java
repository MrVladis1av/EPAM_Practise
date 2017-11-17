package TestsForTask3;

import TestingTask.TemperatureConverter;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class TestForTask3 {
    public static TemperatureConverter temperatureConverter;

    @BeforeClass
    public static void init() {
        temperatureConverter = new TemperatureConverter();
    }

    @AfterClass
    public static void clear() {
        temperatureConverter = null;
    }

    @Test
    public void testConvertFtoC() {
        assertEquals(-12.2, temperatureConverter.convertFtoC(10), 0.1);

    }

    @Test
    public void testConvertCtoF() {
        for (int i = 0; i < 50; i++) {
            assertEquals(32 + i * 1.8, temperatureConverter.convertCtoF(i), 0.1);
        }
    }

    @Test
    public void testConvertCtoK() {
        assertEquals(273.15, temperatureConverter.convertCtoK(0), 0.1);
    }

    @Test
    public void testConvertKtoC() {
        assertEquals(-273.15, temperatureConverter.convertKtoC(0), 0.1);
    }

    @Test
    public void testConvertFtoK() {
        assertEquals(255.372, temperatureConverter.convertFtoK(0), 0.1);
    }

    @Test
    public void testConvertKtoF() {

        assertEquals(-459.67, temperatureConverter.convertKtoF(0), 0.1);
    }
}
