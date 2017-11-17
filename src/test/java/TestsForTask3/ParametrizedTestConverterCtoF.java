package TestsForTask3;

import TestingTask.TemperatureConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedTestConverterCtoF {
    @Parameterized.Parameter
    public double c;
    @Parameterized.Parameter(1)
    public double f;
    @Parameterized.Parameter(2)
    public double k;

    @Parameterized.Parameters(name = "{index}: {0} Celsius equal to {1} Fahrenheits or {2} Kelvins")
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0, 32, 273.15},
                {1, 33.8, 274.15},
                {2, 35.6, 275.15},
                {3, 37.4, 276.15},
                {4, 39.2, 277.15},
                {5, 41, 278.15},
        });
    }

    @Test
    public void testConverterC() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(f, converter.convertCtoF(c), 0.1);
        assertEquals(k, converter.convertCtoK(c), 0.1);
    }

    @Test
    public void testConverterF() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(c, converter.convertFtoC(f), 0.1);
        assertEquals(k, converter.convertFtoK(f), 0.1);
    }

    @Test
    public void testConverterK() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(c, converter.convertKtoC(k), 0.1);
        assertEquals(f, converter.convertKtoF(k), 0.1);
    }
}
